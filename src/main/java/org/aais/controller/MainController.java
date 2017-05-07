package org.aais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/aais")
public class MainController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homepage() {
		return "index";
	}
	
	@RequestMapping(value="/testRuna", method=RequestMethod.GET)
	public String testrun() {
		System.out.println("called from js");
		return "test";
		
	}
	
	
}
