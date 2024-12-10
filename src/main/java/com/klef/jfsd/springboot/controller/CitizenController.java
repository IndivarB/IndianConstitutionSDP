package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CitizenController {

	@GetMapping("citizenreg")
	public ModelAndView citizenreg() {
		return new ModelAndView("citizenreg");
	}
	
	@GetMapping("citizenlogin")
	public ModelAndView citizenlogin() {
		return new ModelAndView("citizenlogin");
	}
}
