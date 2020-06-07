package com.base.dashboad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
	
	@GetMapping("/vehiclemaintenance")
	public String getCountries() {
		return "vehiclemaintenance";
	}

}
