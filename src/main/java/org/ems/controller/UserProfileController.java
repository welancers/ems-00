package org.ems.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.ems.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/userProfile")
public class UserProfileController {
	
	@RequestMapping(value="/getDetails", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ArrayList getDetails() {
		System.out.println("test data");
		User employee = new User();
		employee.setFirstName("Nivas");
		employee.setLastName("G");
		employee.setLandlineNum("044-24424242");
		employee.setMobileNum("9876543210");
		employee.setOfficeEmail("officialmail@domain.com");
		employee.setPersonalEmail("personalmail@domain.com");
		employee.setOtherContactNum("99876512340");
		employee.setResidentialAddr("T.Nagar,Chennai");
		
		ArrayList empList = new ArrayList();
		empList.add(employee);
		System.out.println(empList);
		return empList;
				
	}
}
