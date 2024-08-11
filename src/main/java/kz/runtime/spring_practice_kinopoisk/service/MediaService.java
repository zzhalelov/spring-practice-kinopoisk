package kz.runtime.spring_practice_kinopoisk.service;

import kz.runtime.spring_practice_kinopoisk.model.Media;
import kz.runtime.spring_practice_kinopoisk.model.Type;

import java.util.List;

public interface MediaService {
//    void create(Media media, Type type, long genreId, long countryId, long ageCategoryId, List<String> actors);

    void create(Media media);

    List<Media> findAll();

    Media findById(Long id);
}