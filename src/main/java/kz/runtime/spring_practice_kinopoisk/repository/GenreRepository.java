package kz.runtime.spring_practice_kinopoisk.repository;

import kz.runtime.spring_practice_kinopoisk.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}