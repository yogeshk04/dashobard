package com.base.dashboad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
	
	@GetMapping("/employeetype")
	public String getEmpType() {
		return "employeetype";
	}

}
