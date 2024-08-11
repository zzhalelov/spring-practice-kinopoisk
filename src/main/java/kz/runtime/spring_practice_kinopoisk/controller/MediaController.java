package kz.runtime.spring_practice_kinopoisk.controller;

import kz.runtime.spring_practice_kinopoisk.model.AgeCategory;
import kz.runtime.spring_practice_kinopoisk.model.Country;
import kz.runtime.spring_practice_kinopoisk.model.Genre;
import kz.runtime.spring_practice_kinopoisk.model.Media;
import kz.runtime.spring_practice_kinopoisk.repository.AgeCategoryRepository;
import kz.runtime.spring_practice_kinopoisk.repository.CountryRepository;
import kz.runtime.spring_practice_kinopoisk.repository.GenreRepository;
import kz.runtime.spring_practice_kinopoisk.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/medias")
public class MediaController {
    private final MediaService mediaService;
    private final GenreRepository genreRepository;
    private final CountryRepository countryRepository;
    private final AgeCategoryRepository ageCategoryRepository;

    @GetMapping
    public String findAll(Model model) {
        List<Media> medias = mediaService.findAll();
        model.addAttribute("medias", medias);
        return "medias";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("media", new Media());

        //получаем жанры из базы данных
        List<Genre> genres = genreRepository.findAll();
        model.addAttribute("genres", genreRepository.findAll());

        //получаем страны из БД
        List<Country> countries = countryRepository.findAll();
        model.addAttribute("countries", countries);

        //получаем возрастные категории из БД
        List<AgeCategory> ageCategories = ageCategoryRepository.findAll();
        model.addAttribute("ageCategories", ageCategories);

        return "media_create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Media media) {
        // Найди жанр по ID и установи его в объекте Media
        Genre genre = genreRepository.findById(media.getGenre().getId())
                .orElseThrow(() -> new RuntimeException("Genre not found"));
        media.setGenre(genre);

        mediaService.create(media);
        return "redirect:/medias";
    }
}