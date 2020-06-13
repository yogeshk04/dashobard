package com.base.dashboad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.base.dashboad.models.Country;
import com.base.dashboad.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String getCountries(Model model) {
		
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);

		return "countries";
	}
	
	@PostMapping("/countries/addNewCountry")
	public String addNewCountry(Country country) {
		countryService.save(country);
		
		return "redirect:/countries";
	}

}
	