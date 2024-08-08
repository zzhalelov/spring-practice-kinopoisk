package kz.runtime.spring_practice_kinopoisk.repository;

import kz.runtime.spring_practice_kinopoisk.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}