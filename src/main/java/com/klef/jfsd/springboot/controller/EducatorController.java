package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EducatorController {


	@GetMapping("edureg")
	public ModelAndView edureg() {
		return new ModelAndView("edureg");
	}
	
	@GetMapping("edulogin")
	public ModelAndView edulogin() {
		return new ModelAndView("edulogin");
	}
	
}
