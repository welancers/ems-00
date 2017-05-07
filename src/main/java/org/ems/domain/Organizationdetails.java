package org.ems.domain;
// Generated 7 May, 2017 5:12:11 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Organizationdetails generated by hbm2java
 */
@Entity
@Table(name="organizationdetails"
    ,catalog="leave_app"
)

public class Organizationdetails
 {


     private String organizationid;
     private Organization organization;
     private String organizationname;
     private String address1;
     private String address2;
     private String address3;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;

    public Organizationdetails() {
    }

    public Organizationdetails(String organizationid, Organization organization, String organizationname, String address1, String address2, String address3, String createdusercode, Date createddate, String modusercode, Date moddate) {
       this.organizationid = organizationid;
       this.organization = organization;
       this.organizationname = organizationname;
       this.address1 = address1;
       this.address2 = address2;
       this.address3 = address3;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
    }
   
     @Id 
    
    @Column(name="organizationid", unique=true, nullable=false, length=50)
    public String getOrganizationid() {
        return this.organizationid;
    }
    
    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="organizationid", unique=true, nullable=false, insertable=false, updatable=false)
    public Organization getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    @Column(name="organizationname", nullable=false, length=50)
    public String getOrganizationname() {
        return this.organizationname;
    }
    
    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }
    
    @Column(name="address1", nullable=false, length=50)
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    @Column(name="address2", nullable=false, length=50)
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    @Column(name="address3", nullable=false, length=50)
    public String getAddress3() {
        return this.address3;
    }
    
    public void setAddress3(String address3) {
        this.address3 = address3;
    }
    
    @Column(name="createdusercode", nullable=false, length=50)
    public String getCreatedusercode() {
        return this.createdusercode;
    }
    
    public void setCreatedusercode(String createdusercode) {
        this.createdusercode = createdusercode;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="createddate", nullable=false, length=10)
    public Date getCreateddate() {
        return this.createddate;
    }
    
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
    
    @Column(name="modusercode", nullable=false, length=50)
    public String getModusercode() {
        return this.modusercode;
    }
    
    public void setModusercode(String modusercode) {
        this.modusercode = modusercode;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="moddate", nullable=false, length=10)
    public Date getModdate() {
        return this.moddate;
    }
    
    public void setModdate(Date moddate) {
        this.moddate = moddate;
    }




}


