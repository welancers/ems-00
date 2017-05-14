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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Groupmaster generated by hbm2java
 */
@Entity
@Table(name="groupmaster"
    ,catalog="ems"
)

public class Groupmaster
 {


     private GroupmasterId id;
     private Organization organization;
     private String groupdesc;
     private String createdusercode;
     private Date createddate;
     private String modusercode;
     private Date moddate;
     private Set<Groupaccess> groupaccesses = new HashSet<Groupaccess>(0);
     private Set<Usergroup> usergroups = new HashSet<Usergroup>(0);

    public Groupmaster() {
    }

	
    public Groupmaster(GroupmasterId id, Organization organization, String groupdesc, String createdusercode, Date createddate, String modusercode, Date moddate) {
        this.id = id;
        this.organization = organization;
        this.groupdesc = groupdesc;
        this.createdusercode = createdusercode;
        this.createddate = createddate;
        this.modusercode = modusercode;
        this.moddate = moddate;
    }
    public Groupmaster(GroupmasterId id, Organization organization, String groupdesc, String createdusercode, Date createddate, String modusercode, Date moddate, Set<Groupaccess> groupaccesses, Set<Usergroup> usergroups) {
       this.id = id;
       this.organization = organization;
       this.groupdesc = groupdesc;
       this.createdusercode = createdusercode;
       this.createddate = createddate;
       this.modusercode = modusercode;
       this.moddate = moddate;
       this.groupaccesses = groupaccesses;
       this.usergroups = usergroups;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="organizationid", column=@Column(name="organizationid", nullable=false, length=50) ), 
        @AttributeOverride(name="groupcode", column=@Column(name="groupcode", nullable=false, length=50) ) } )
    public GroupmasterId getId() {
        return this.id;
    }
    
    public void setId(GroupmasterId id) {
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
    
    @Column(name="groupdesc", nullable=false, length=50)
    public String getGroupdesc() {
        return this.groupdesc;
    }
    
    public void setGroupdesc(String groupdesc) {
        this.groupdesc = groupdesc;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="groupmaster")
    public Set<Groupaccess> getGroupaccesses() {
        return this.groupaccesses;
    }
    
    public void setGroupaccesses(Set<Groupaccess> groupaccesses) {
        this.groupaccesses = groupaccesses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="groupmaster")
    public Set<Usergroup> getUsergroups() {
        return this.usergroups;
    }
    
    public void setUsergroups(Set<Usergroup> usergroups) {
        this.usergroups = usergroups;
    }




}


