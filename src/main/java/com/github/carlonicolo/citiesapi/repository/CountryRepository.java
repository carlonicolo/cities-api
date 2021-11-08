package com.github.carlonicolo.citiesapi.repository;

import com.github.carlonicolo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
