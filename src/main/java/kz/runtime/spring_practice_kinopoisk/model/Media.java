package kz.runtime.spring_practice_kinopoisk.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "medias")
@Entity
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    Type type;
    int releaseYear;
    String country;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    Genre genre;

    @OneToOne
    @JoinColumn(name = "age_category_id")
    AgeCategory ageCategory;

    String description;
    String urlMedia;
}