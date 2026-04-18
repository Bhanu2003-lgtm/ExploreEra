package com.Live2Explore.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer
{
	@Id
	@GeneratedValue
	private long uid;
	
	@Column(nullable=false)
	private String fullName;
	
	@Column(nullable=false)
	private String userName;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String mobileNo;
	
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
	
	
}

	
	
	
	