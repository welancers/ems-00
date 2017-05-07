package org.ems.domain;
// Generated 7 May, 2017 5:12:11 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Leavetype generated by hbm2java
 */
@Entity
@Table(name="leavetype"
    ,catalog="leave_app"
)

public class Leavetype
 {


     private LeavetypeId id;
     private Organization organization;
     private String leaveDesc;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;

    public Leavetype() {
    }

    public Leavetype(LeavetypeId id, Organization organization, String leaveDesc, String createdusercode, Date createddate, String modusercode, Date moddate) {
       this.id = id;
       this.organization = organization;
       this.leaveDesc = leaveDesc;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="leavecode", column=@Column(name="leavecode", nullable=false, length=50) ) } )
    public LeavetypeId getId() {
        return this.id;
    }
    
    public void setId(LeavetypeId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="organizationid", nullable=false, insertable=false, updatable=false)
    public Organization getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    @Column(name="leaveDesc", nullable=false, length=50)
    public String getLeaveDesc() {
        return this.leaveDesc;
    }
    
    public void setLeaveDesc(String leaveDesc) {
        this.leaveDesc = leaveDesc;
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


