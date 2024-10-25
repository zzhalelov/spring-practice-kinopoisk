package kz.runtime.spring_practice_kinopoisk.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

public class Crew {
    long id;
    private String director;

    @ManyToMany
    @JoinTable(
            name = "crew_actors",
            joinColumns = @JoinColumn(name = "crew_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )

    private List<Actor> actorList;
}