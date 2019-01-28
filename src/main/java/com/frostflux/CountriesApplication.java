package com.frostflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.frostflux.entities.Country;
import com.frostflux.repositories.CountryRepository;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner{

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		countryRepository.save(new Country("Earth","World"));
		countryRepository.save(new Country("China","Peking"));
		
	}

}

