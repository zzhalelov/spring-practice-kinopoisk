package kz.runtime.spring_practice_kinopoisk.repository;

import kz.runtime.spring_practice_kinopoisk.model.AgeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeCategoryRepository extends JpaRepository<AgeCategory, Long> {
}
