package org.ems.domain;
// Generated 21 May, 2017 10:47:02 AM by Hibernate Tools 3.2.2.GA


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * LeavetypeId generated by hbm2java
 */
@Embeddable

public class LeavetypeId implements Serializable
 {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String organizationid;
     private String leavecode;

    public LeavetypeId() {
    }

    public LeavetypeId(String organizationid, String leavecode) {
       this.organizationid = organizationid;
       this.leavecode = leavecode;
    }
   

    @Column(name="organizationid", nullable=false, length=50)
    public String getOrganizationid() {
        return this.organizationid;
    }
    
    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid;
    }

    @Column(name="leavecode", nullable=false, length=50)
    public String getLeavecode() {
        return this.leavecode;
    }
    
    public void setLeavecode(String leavecode) {
        this.leavecode = leavecode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LeavetypeId) ) return false;
		 LeavetypeId castOther = ( LeavetypeId ) other; 
         
		 return ( (this.getOrganizationid()==castOther.getOrganizationid()) || ( this.getOrganizationid()!=null && castOther.getOrganizationid()!=null && this.getOrganizationid().equals(castOther.getOrganizationid()) ) )
 && ( (this.getLeavecode()==castOther.getLeavecode()) || ( this.getLeavecode()!=null && castOther.getLeavecode()!=null && this.getLeavecode().equals(castOther.getLeavecode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOrganizationid() == null ? 0 : this.getOrganizationid().hashCode() );
         result = 37 * result + ( getLeavecode() == null ? 0 : this.getLeavecode().hashCode() );
         return result;
   }   


}


