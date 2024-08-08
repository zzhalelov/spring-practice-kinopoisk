package kz.runtime.spring_practice_kinopoisk.service.impl;

import kz.runtime.spring_practice_kinopoisk.model.Genre;
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
    public void create(Media media,
                       Type type,
                       long genreId,
                       long countryId,
                       long ageCategoryId,
                       List<String> actors) {
        //находим тип медиа по id


        //устанавливаем тип для медиа

        //находим жанр по id
        Genre genre = genreRepository.findById(genreId).orElseThrow();

        //устанавливаем жанр для медиа
        media.setGenre(genre);

        //сохраняем медиа в БД
        mediaRepository.save(media);

    }
}