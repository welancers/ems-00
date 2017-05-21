package org.ems.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ems.beans.User;
import org.ems.domain.Organization;
import org.ems.organization.IorgService;
import org.ems.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/userProfile")
public class UserProfileController {
	private static final long serialVersionUID = 1L;
	@Autowired
	IorgService orgService;
	
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
		Organization org = new Organization();
		
		org.setOrganizationid("akshar");
		org.setOrganizationname("Test Name");
		orgService.add(org);
		
		ArrayList empList = new ArrayList();
		empList.add(employee);
		System.out.println(empList);
		return empList;
				
	}
	@RequestMapping(value="/applyLeave", method=RequestMethod.POST)
	@ResponseBody
	public String applyForLeave(@RequestBody Organization org) {
		System.out.println("into");

		org.setOrganizationid("akshar");
		org.setOrganizationname("Test Name");
		orgService.add(org);
		orgService.add(org);
		System.out.println(org.getOrganizationid());
		System.out.println(org.getOrganizationname());
		return "testString";
	}
	

}
