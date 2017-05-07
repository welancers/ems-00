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
 * Workapprovaldetails generated by hbm2java
 */
@Entity
@Table(name="workapprovaldetails"
    ,catalog="leave_app"
)

public class Workapprovaldetails
 {


     private WorkapprovaldetailsId id;
     private Screen screen;
     private Integer noOfApproval;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;

    public Workapprovaldetails() {
    }

	
    public Workapprovaldetails(WorkapprovaldetailsId id, Screen screen, String createdusercode, Date createddate, String modusercode, Date moddate) {
        this.id = id;
        this.screen = screen;
        this.createdusercode = createdusercode;
        this.createddate = createddate;
        this.modusercode = modusercode;
        this.moddate = moddate;
    }
    public Workapprovaldetails(WorkapprovaldetailsId id, Screen screen, Integer noOfApproval, String createdusercode, Date createddate, String modusercode, Date moddate) {
       this.id = id;
       this.screen = screen;
       this.noOfApproval = noOfApproval;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="screenno", column=@Column(name="screenno", nullable=false, length=50) ) } )
    public WorkapprovaldetailsId getId() {
        return this.id;
    }
    
    public void setId(WorkapprovaldetailsId id) {
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
    
    @Column(name="noOfApproval")
    public Integer getNoOfApproval() {
        return this.noOfApproval;
    }
    
    public void setNoOfApproval(Integer noOfApproval) {
        this.noOfApproval = noOfApproval;
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

