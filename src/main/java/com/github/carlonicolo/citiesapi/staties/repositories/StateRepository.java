package com.github.carlonicolo.citiesapi.staties.repositories;

import com.github.carlonicolo.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
