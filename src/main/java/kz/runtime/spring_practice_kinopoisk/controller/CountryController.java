package kz.runtime.spring_practice_kinopoisk.controller;

import kz.runtime.spring_practice_kinopoisk.model.Country;
import kz.runtime.spring_practice_kinopoisk.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/countries")
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public String findAllCountries(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "countries";
    }

    @GetMapping("/create")
    public String showCreateCountryForm(Model model) {
        model.addAttribute("country", new Country());
        return "country_create";
    }

    @PostMapping("/create")
    public String createCountry(@ModelAttribute Country country) {
        countryService.create(country);
        return "redirect:/countries";
    }
}