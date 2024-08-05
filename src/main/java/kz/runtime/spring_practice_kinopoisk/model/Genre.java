package kz.runtime.spring_practice_kinopoisk.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "genres")
@Entity
@ToString
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    //


//    Genre
//    ACTION,
//    ADVENTURE,
//    ANIME,
//    COMEDY,
//    DRAMA,
//    FEATURE,
//    CRIME,
//    DOCUMENTARY,
//    HISTORICAL,
//    HORROR,
//    MUSICAL,
//    ROMCOM,
//    SCIFI,
//    SHORT,
//    THRILLER
}