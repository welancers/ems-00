package org.ems.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ems.beans.User;
import org.ems.domain.Organization;
import org.ems.domain.Userprofile;
import org.ems.domain.UserprofileId;
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
@RequestMapping(value = "/loginservice")
public class LoginController {
	private static final long serialVersionUID = 1L;
	@Autowired
	IorgService orgService;

	@RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "loggedOut";
	}


	public void add(Organization org) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		session.save(org);
		t.commit();
		System.out.println("success");

		session.close();

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ArrayList UserLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody  Map<String, String> userDetails) throws IOException, ServletException {
		System.out.println("called from js");
		System.out.println("requestparam"+userDetails);
		UserprofileId userProfileId = new UserprofileId();
		userProfileId.setOrganizationid("akshar");
		userProfileId.setUsercode(userDetails.get("usercode"));
		HttpSession session = request.getSession();
		Userprofile userProfile = getUserDetails(userProfileId);
		ArrayList<String> loginResp= new ArrayList<String>();
		System.out.println(userProfile.getDeptid());
		if(userProfile.getId()!=null){
			session.setAttribute("userInSession", userProfile);
			loginResp.add(userProfile.getDeptid());
		}
		else{			
			loginResp.add("InvalidUser");
		}		
		 return loginResp;

	}
	
	public Userprofile getUserDetails(UserprofileId userId){		
		Object obj = orgService.getDbObj(userId);
		return (Userprofile)obj;
	}

}
