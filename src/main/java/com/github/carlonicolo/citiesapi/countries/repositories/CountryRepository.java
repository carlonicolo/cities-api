package com.github.carlonicolo.citiesapi.countries.repositories;

import com.github.carlonicolo.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
