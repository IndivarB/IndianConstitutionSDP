package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@GetMapping("")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@GetMapping("adminlogin")
	public ModelAndView login() {
		return new ModelAndView("adminlogin");
	}
	
	@GetMapping("about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}
	
	@GetMapping("constitutionframework")
	public ModelAndView constitutionframework() {
		return new ModelAndView("constitutionframework");
	}


	@GetMapping("fundamentalrights")
	public ModelAndView fundamentalrights() {
		return new ModelAndView("fundamentalrights");
	}
	
	@GetMapping("workshops")
	public ModelAndView workshops() {
		return new ModelAndView("workshops");
	}
	
	
    @PostMapping("checkadminlogin")
    public ModelAndView checkadminlogin(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String auname = request.getParameter("auname");
        String apwd = request.getParameter("apwd");

        Admin admin = adminService.checkadminlogin(auname, apwd);
        
        if (admin != null) {
            mv.setViewName("adminhome");
            //long count = adminService.usercount();
            //mv.addObject("usercount", count);
        } 
        
        else {
            mv.setViewName("adminloginfail");
            mv.addObject("message", "Login Failed");
        }
        return mv;
    }
    
    
    @GetMapping("adminlogout")
    public ModelAndView adminlogout() {
    	return new ModelAndView("adminlogout");
    }
}
