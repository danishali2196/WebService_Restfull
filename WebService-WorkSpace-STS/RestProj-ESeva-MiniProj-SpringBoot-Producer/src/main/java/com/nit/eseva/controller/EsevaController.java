package com.nit.eseva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EsevaController {
	
	@GetMapping("/home")
	public String showRegPage() {
		return "reg";
	}
	


}
