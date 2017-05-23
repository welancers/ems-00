package org.ems.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ems.beans.User;
import org.ems.domain.Organization;
import org.ems.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value="/applyLeave", method=RequestMethod.POST)
	@ResponseBody
	public String applyForLeave() {
		Organization org=new Organization();
		System.out.println("into");
		add(org);
		System.out.println(org.getOrganizationid());
		System.out.println(org.getOrganizationname());
		return "testString";
	}
	
	public void add(Organization org) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		
		session.save(org);
		t.commit();
		System.out.println("success");
		
		session.close();
		
		}
	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void testrun(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("called from js");
		RequestDispatcher rd = request.getRequestDispatcher("/ems/home");
		rd.forward(request, response);
		//return "test";
		
	}
}
