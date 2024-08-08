package kz.runtime.spring_practice_kinopoisk.repository;

import kz.runtime.spring_practice_kinopoisk.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {

}