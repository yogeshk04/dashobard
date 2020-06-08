package com.base.dashboad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VechicleStatusController {
	
	@GetMapping("/vehiclestatus")
	public String getVehicleStatus() {
		return "vehiclestatus";
	}

}
