package org.ems.organization;

import org.ems.domain.Organization;
import org.ems.domain.Userprofile;
import org.ems.domain.UserprofileId;
import org.ems.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component("orgService")
public class orgService implements IorgService{
	static{
		
	}
	
	public void add(Organization org) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		session.save(org);
		t.commit();
		System.out.println("success");
		session.close();

	}
	
	public Userprofile getDbObj(UserprofileId obj){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Userprofile dbObj = (Userprofile) session.get(Userprofile.class, obj); 
		
		System.out.println("getDbObj: "+dbObj.getPassword());
		session.close();
		return dbObj;
		
	}
}
