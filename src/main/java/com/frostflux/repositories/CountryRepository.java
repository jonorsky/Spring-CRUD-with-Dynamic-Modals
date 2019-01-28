package com.frostflux.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frostflux.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
