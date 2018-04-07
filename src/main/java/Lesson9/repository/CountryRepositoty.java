package Lesson9.repository;

import Lesson9.domain.Country;

import java.util.List;

public interface CountryRepositoty {

    Country create(String name, String capital, double population);

    Country delete (Country country);

    Country getById(int id);

    List<Country> getCountriesWithMillionPopulation();
}
