package org.ems.domain;
// Generated 21 May, 2017 10:47:02 AM by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Screen generated by hbm2java
 */
@Entity
@Table(name="screen"
    ,catalog="ems"
)

public class Screen implements Serializable
 {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ScreenId id;
     private Organization organization;
     private String tablename;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;
     private Set<Workapprovaldetails> workapprovaldetailses = new HashSet<Workapprovaldetails>(0);
     private Set<Groupaccess> groupaccesses = new HashSet<Groupaccess>(0);
     private Set<Workbasketdetails> workbasketdetailses = new HashSet<Workbasketdetails>(0);

    public Screen() {
    }

	
    public Screen(ScreenId id, Organization organization, String tablename, String createdusercode, Date createddate, String modusercode, Date moddate) {
        this.id = id;
        this.organization = organization;
        this.tablename = tablename;
        this.createdusercode = createdusercode;
        this.createddate = createddate;
        this.modusercode = modusercode;
        this.moddate = moddate;
    }
    public Screen(ScreenId id, Organization organization, String tablename, String createdusercode, Date createddate, String modusercode, Date moddate, Set<Workapprovaldetails> workapprovaldetailses, Set<Groupaccess> groupaccesses, Set<Workbasketdetails> workbasketdetailses) {
       this.id = id;
       this.organization = organization;
       this.tablename = tablename;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
       this.workapprovaldetailses = workapprovaldetailses;
       this.groupaccesses = groupaccesses;
       this.workbasketdetailses = workbasketdetailses;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="screenno", column=@Column(name="screenno", nullable=false, length=50) ) } )
    public ScreenId getId() {
        return this.id;
    }
    
    public void setId(ScreenId id) {
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
    
    @Column(name="tablename", nullable=false, length=50)
    public String getTablename() {
        return this.tablename;
    }
    
    public void setTablename(String tablename) {
        this.tablename = tablename;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="screen")
    public Set<Workapprovaldetails> getWorkapprovaldetailses() {
        return this.workapprovaldetailses;
    }
    
    public void setWorkapprovaldetailses(Set<Workapprovaldetails> workapprovaldetailses) {
        this.workapprovaldetailses = workapprovaldetailses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="screen")
    public Set<Groupaccess> getGroupaccesses() {
        return this.groupaccesses;
    }
    
    public void setGroupaccesses(Set<Groupaccess> groupaccesses) {
        this.groupaccesses = groupaccesses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="screen")
    public Set<Workbasketdetails> getWorkbasketdetailses() {
        return this.workbasketdetailses;
    }
    
    public void setWorkbasketdetailses(Set<Workbasketdetails> workbasketdetailses) {
        this.workbasketdetailses = workbasketdetailses;
    }




}


