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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Workbasketdetails generated by hbm2java
 */
@Entity
@Table(name="workbasketdetails"
    ,catalog="ems"
)

public class Workbasketdetails
 {


     private WorkbasketdetailsId id;
     private Screen screen;
     private Userprofile userprofileByFkWorkbasketdetailsAssignedto;
     private Userprofile userprofileByFkWorkbasketdetailsUserCreatedby;
     private String assignedLvl;
     private String remarks;
     private String approvalStatus;
     private Date createddate;
     private String modusercode;
     private Date moddate;

    public Workbasketdetails() {
    }

	
    public Workbasketdetails(WorkbasketdetailsId id, Screen screen, Userprofile userprofileByFkWorkbasketdetailsAssignedto, Userprofile userprofileByFkWorkbasketdetailsUserCreatedby, String assignedLvl, Date createddate, String modusercode, Date moddate) {
        this.id = id;
        this.screen = screen;
        this.userprofileByFkWorkbasketdetailsAssignedto = userprofileByFkWorkbasketdetailsAssignedto;
        this.userprofileByFkWorkbasketdetailsUserCreatedby = userprofileByFkWorkbasketdetailsUserCreatedby;
        this.assignedLvl = assignedLvl;
        this.createddate = createddate;
        this.modusercode = modusercode;
        this.moddate = moddate;
    }
    public Workbasketdetails(WorkbasketdetailsId id, Screen screen, Userprofile userprofileByFkWorkbasketdetailsAssignedto, Userprofile userprofileByFkWorkbasketdetailsUserCreatedby, String assignedLvl, String remarks, String approvalStatus, Date createddate, String modusercode, Date moddate) {
       this.id = id;
       this.screen = screen;
       this.userprofileByFkWorkbasketdetailsAssignedto = userprofileByFkWorkbasketdetailsAssignedto;
       this.userprofileByFkWorkbasketdetailsUserCreatedby = userprofileByFkWorkbasketdetailsUserCreatedby;
       this.assignedLvl = assignedLvl;
       this.remarks = remarks;
       this.approvalStatus = approvalStatus;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="workassignId", column=@Column(name="workassignId", nullable=false, length=50) ) } )
    public WorkbasketdetailsId getId() {
        return this.id;
    }
    
    public void setId(WorkbasketdetailsId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="organizationid", referencedColumnName="organizationid", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="screenno", referencedColumnName="screenno", nullable=false, insertable=false, updatable=false) } )
    public Screen getScreen() {
        return this.screen;
    }
    
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="organizationid", referencedColumnName="organizationid", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="assignedTo", referencedColumnName="usercode", insertable=false, updatable=false) } )
    public Userprofile getUserprofileByFkWorkbasketdetailsAssignedto() {
        return this.userprofileByFkWorkbasketdetailsAssignedto;
    }
    
    public void setUserprofileByFkWorkbasketdetailsAssignedto(Userprofile userprofileByFkWorkbasketdetailsAssignedto) {
        this.userprofileByFkWorkbasketdetailsAssignedto = userprofileByFkWorkbasketdetailsAssignedto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="organizationid", referencedColumnName="organizationid", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="createdusercode", referencedColumnName="usercode", nullable=false, insertable=false, updatable=false) } )
    public Userprofile getUserprofileByFkWorkbasketdetailsUserCreatedby() {
        return this.userprofileByFkWorkbasketdetailsUserCreatedby;
    }
    
    public void setUserprofileByFkWorkbasketdetailsUserCreatedby(Userprofile userprofileByFkWorkbasketdetailsUserCreatedby) {
        this.userprofileByFkWorkbasketdetailsUserCreatedby = userprofileByFkWorkbasketdetailsUserCreatedby;
    }
    
    @Column(name="assignedLvl", nullable=false, length=50)
    public String getAssignedLvl() {
        return this.assignedLvl;
    }
    
    public void setAssignedLvl(String assignedLvl) {
        this.assignedLvl = assignedLvl;
    }
    
    @Column(name="remarks", length=50)
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    @Column(name="approvalStatus", length=50)
    public String getApprovalStatus() {
        return this.approvalStatus;
    }
    
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
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

