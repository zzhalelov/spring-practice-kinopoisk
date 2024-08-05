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
        return null;
    }

    @Override
    public void create(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public void update(long id, Genre updatedEntity) {

    }

    @Override
    public void deleteById(long id) {

    }
}