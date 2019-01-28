package com.frostflux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frostflux.entities.Country;
import com.frostflux.repositories.CountryRepository;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@Controller
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepo;
	
	@GetMapping("/")
	public String showPage(Model model,@RequestParam(defaultValue="0") int page) {
		model.addAttribute("data",countryRepo.
				findAll(PageRequest.of(page,4)));
		return "index";
	}
	
	@PostMapping("/save")
	public String save(Country c) {
		countryRepo.save(c);
		
		return "redirect:/";
	}
}
