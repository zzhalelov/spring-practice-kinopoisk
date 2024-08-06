package kz.runtime.spring_practice_kinopoisk.service.impl;

import kz.runtime.spring_practice_kinopoisk.model.Country;
import kz.runtime.spring_practice_kinopoisk.repository.CountryRepository;
import kz.runtime.spring_practice_kinopoisk.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return null;
    }

    @Override
    public void create(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void update(long id, Country updatedEntity) {

    }

    @Override
    public void deleteById(long id) {

    }
}