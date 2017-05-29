package org.ems.organization;

import org.ems.domain.Organization;
import org.ems.domain.Userprofile;
import org.ems.domain.UserprofileId;

public interface IorgService {

	public void add(Organization org);
	public Userprofile getDbObj(UserprofileId obj);

}
