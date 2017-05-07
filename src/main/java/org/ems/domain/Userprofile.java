package org.ems.domain;
// Generated 7 May, 2017 5:12:11 PM by Hibernate Tools 3.2.2.GA


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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


/**
 * Userprofile generated by hbm2java
 */
@Entity
@Table(name="userprofile"
    ,catalog="leave_app"
    , uniqueConstraints = @UniqueConstraint(columnNames="usercode") 
)

public class Userprofile
 {


     private UserprofileId id;
     private Userhiervalue userhiervalue;
     private String password;
     private String deptid;
     private String emailid;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;
     private Set<Usergroup> usergroups = new HashSet<Usergroup>(0);
     private Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsUserCreatedby = new HashSet<Workbasketdetails>(0);
     private Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsAssignedto = new HashSet<Workbasketdetails>(0);

    public Userprofile() {
    }

	
    public Userprofile(UserprofileId id, Userhiervalue userhiervalue, String password, String createdusercode, Date createddate, String modusercode, Date moddate) {
        this.id = id;
        this.userhiervalue = userhiervalue;
        this.password = password;
        this.createdusercode = createdusercode;
        this.createddate = createddate;
        this.modusercode = modusercode;
        this.moddate = moddate;
    }
    public Userprofile(UserprofileId id, Userhiervalue userhiervalue, String password, String deptid, String emailid, String createdusercode, Date createddate, String modusercode, Date moddate, Set<Usergroup> usergroups, Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsUserCreatedby, Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsAssignedto) {
       this.id = id;
       this.userhiervalue = userhiervalue;
       this.password = password;
       this.deptid = deptid;
       this.emailid = emailid;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
       this.usergroups = usergroups;
       this.workbasketdetailsesForFkWorkbasketdetailsUserCreatedby = workbasketdetailsesForFkWorkbasketdetailsUserCreatedby;
       this.workbasketdetailsesForFkWorkbasketdetailsAssignedto = workbasketdetailsesForFkWorkbasketdetailsAssignedto;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="usercode", column=@Column(name="usercode", unique=true, nullable=false, length=50) ) } )
    public UserprofileId getId() {
        return this.id;
    }
    
    public void setId(UserprofileId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="organizationid", referencedColumnName="organizationid", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="usrValcode", referencedColumnName="usrValcode", nullable=false, insertable=false, updatable=false) } )
    public Userhiervalue getUserhiervalue() {
        return this.userhiervalue;
    }
    
    public void setUserhiervalue(Userhiervalue userhiervalue) {
        this.userhiervalue = userhiervalue;
    }
    
    @Column(name="password", nullable=false, length=100)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="deptid", length=50)
    public String getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }
    
    @Column(name="emailid", length=50)
    public String getEmailid() {
        return this.emailid;
    }
    
    public void setEmailid(String emailid) {
        this.emailid = emailid;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userprofile")
    public Set<Usergroup> getUsergroups() {
        return this.usergroups;
    }
    
    public void setUsergroups(Set<Usergroup> usergroups) {
        this.usergroups = usergroups;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userprofileByFkWorkbasketdetailsUserCreatedby")
    public Set<Workbasketdetails> getWorkbasketdetailsesForFkWorkbasketdetailsUserCreatedby() {
        return this.workbasketdetailsesForFkWorkbasketdetailsUserCreatedby;
    }
    
    public void setWorkbasketdetailsesForFkWorkbasketdetailsUserCreatedby(Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsUserCreatedby) {
        this.workbasketdetailsesForFkWorkbasketdetailsUserCreatedby = workbasketdetailsesForFkWorkbasketdetailsUserCreatedby;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userprofileByFkWorkbasketdetailsAssignedto")
    public Set<Workbasketdetails> getWorkbasketdetailsesForFkWorkbasketdetailsAssignedto() {
        return this.workbasketdetailsesForFkWorkbasketdetailsAssignedto;
    }
    
    public void setWorkbasketdetailsesForFkWorkbasketdetailsAssignedto(Set<Workbasketdetails> workbasketdetailsesForFkWorkbasketdetailsAssignedto) {
        this.workbasketdetailsesForFkWorkbasketdetailsAssignedto = workbasketdetailsesForFkWorkbasketdetailsAssignedto;
    }




}

