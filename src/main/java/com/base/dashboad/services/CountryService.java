package com.base.dashboad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dashboad.models.Country;
import com.base.dashboad.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	// add new country
	public void save(Country country) {
		countryRepository.save(country);
	}
}
