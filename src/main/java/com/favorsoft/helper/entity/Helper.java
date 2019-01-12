package com.favorsoft.helper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.favorsoft.shared.entity.BaseEntity;

@Entity
@Table(name="helper")
public class Helper extends BaseEntity{	
	@Id
	@Column(name = "id", length = 128)
	private String knoxId;
	
	@Column(length = 128)
	private String deptCode;
	
	@Column(nullable=false)
	private boolean enable;
	
	@Column(length = 128)
	private String userName;
	
	@Column(length = 128)
	private String site1365;
	
	@Column(length = 128)
	private String phone;
	
	@Column(length = 128)
	private String birthday;
	
	@Transient
    private String projectId;
	
	public String getKnoxId() {
		return knoxId;
	}
	public void setKnoxId(String knoxId) {
		this.knoxId = knoxId;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSite1365() {
		return site1365;
	}
	public void setSite1365(String site1365) {
		this.site1365 = site1365;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
}