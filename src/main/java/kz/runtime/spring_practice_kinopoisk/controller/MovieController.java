package kz.runtime.spring_practice_kinopoisk.controller;

import kz.runtime.spring_practice_kinopoisk.model.Media;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @GetMapping("/movies")
    public String showForm(Model model) {
        Media movie = new Media();
        return "index";
    }
}