package org.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ems.beans.User;
import org.ems.domain.Organization;
import org.ems.domain.Userprofile;
import org.ems.organization.IorgService;
import org.ems.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/userProfile")
public class UserProfileController {
	private static final long serialVersionUID = 1L;
	@Autowired
	IorgService orgService;

	@RequestMapping(value = "/getDetails", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ArrayList getDetails(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test data");
		Userprofile user = (Userprofile)request.getSession().getAttribute("userInSession");
		User employee = new User();
		employee.setFirstName(user.getId().getUsercode());
		employee.setLastName("");
		employee.setLandlineNum("044-24424242");
		employee.setMobileNum("9876543210");
		employee.setOfficeEmail(user.getEmailid());
		employee.setPersonalEmail(user.getEmailid());
		employee.setOtherContactNum("99876512340");
		employee.setResidentialAddr("T.Nagar,Chennai");
		
		System.out.println(user.getEmailid());
		ArrayList empList = new ArrayList();
		empList.add(employee);
		System.out.println(empList);
		return empList;

	}

	@RequestMapping(value = "/applyLeave", method = RequestMethod.POST)
	@ResponseBody
	public String applyForLeave() {
		
		return "testString";
	}

	public void add(Organization org) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		session.save(org);
		t.commit();
		System.out.println("success");

		session.close();

	}

}
