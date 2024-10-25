package kz.runtime.spring_practice_kinopoisk.service.impl;

import kz.runtime.spring_practice_kinopoisk.model.Genre;
import kz.runtime.spring_practice_kinopoisk.repository.GenreRepository;
import kz.runtime.spring_practice_kinopoisk.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public Genre findById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    @Override
    public void create(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public void update(long id, Genre updatedGenre) {
        Genre existingGenre = genreRepository.findById(id).orElseThrow(() -> new RuntimeException("Genre not found"));
        existingGenre.setName(updatedGenre.getName());
        genreRepository.save(existingGenre);
    }

    @Override
    public void deleteById(long id) {
        genreRepository.deleteById(id);
    }
}