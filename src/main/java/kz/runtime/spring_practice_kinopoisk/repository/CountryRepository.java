package kz.runtime.spring_practice_kinopoisk.repository;

import kz.runtime.spring_practice_kinopoisk.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}