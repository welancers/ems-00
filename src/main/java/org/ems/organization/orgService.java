package org.ems.organization;

import org.ems.domain.Organization;
import org.ems.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component("orgService")
public class orgService extends IorgService{
	@Override
	public void add(Organization org) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		session.save(org);
		t.commit();
		System.out.println("success");

		session.close();

	}
}
