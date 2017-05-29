package org.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ems")
public class MainController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String HomePage() {
		return "index";
	}
	@RequestMapping(value="/adminhome", method=RequestMethod.GET)
	public String AdminHomePage() {
		return "adminindex";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String LogOutPage() {
		return "logout";
	}
	
	
	
	
	
}
