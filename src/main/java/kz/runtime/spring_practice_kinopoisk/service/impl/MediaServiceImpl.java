package kz.runtime.spring_practice_kinopoisk.service.impl;

import kz.runtime.spring_practice_kinopoisk.model.Media;
import kz.runtime.spring_practice_kinopoisk.model.Type;
import kz.runtime.spring_practice_kinopoisk.repository.*;
import kz.runtime.spring_practice_kinopoisk.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MediaServiceImpl implements MediaService {
    private final MediaRepository mediaRepository;
    Type type;
    private final GenreRepository genreRepository;
    private final CountryRepository countryRepository;
    private final AgeCategoryRepository ageCategoryRepository;

    @Override
    public void create(Media media) {
        mediaRepository.save(media);
    }

    @Override
    public List<Media> findAll() {
        return mediaRepository.findAll();
    }

    @Override
    public Media findById(Long id) {
        return mediaRepository.findById(id).orElseThrow(() -> new RuntimeException("Media not found"));
    }
}