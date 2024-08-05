package kz.runtime.spring_practice_kinopoisk.controller;

import kz.runtime.spring_practice_kinopoisk.model.Genre;
import kz.runtime.spring_practice_kinopoisk.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/genres")
public class GenreController {
    private final GenreService genreService;

    @GetMapping
    public String findAllGenres(Model model) {
        model.addAttribute("genres", genreService.findAll());
        return "genres";
    }

    @GetMapping("/create")
    public String showCreateGenreForm(Model model) {
        model.addAttribute("genre", new Genre());
        return "genre_create";
    }

    @PostMapping("/create")
    public String createGenre(@ModelAttribute Genre genre) {
        genreService.create(genre);
        return "redirect:/genres";
    }
}