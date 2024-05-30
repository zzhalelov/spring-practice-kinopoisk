package kz.runtime.spring_practice_kinopoisk.springpracticekinopoisk.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Genre {
    Long id;
    String name;
}