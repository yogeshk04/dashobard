package com.base.dashboad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	
	@GetMapping("/countries")
	public String getCountries() {
		return "countries";
	}

}
