package com.Live2Explore.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookigs")
public class Bookigs {

    @Id
    @GeneratedValue
    private long uid;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String mobileNo;

    @Column(nullable = false)
    private String selectDestination;

    @Column(nullable = false)
    private long numberOfPersons;

    @Column(nullable = false)
    private String travelType;
    
    @Column(nullable = false)
    private LocalDate travelDate;

    @Column(nullable = true)
    private String customerAddress;

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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSelectDestination() {
		return selectDestination;
	}

	public void setSelectDestination(String selectDestination) {
		this.selectDestination = selectDestination;
	}

	public long getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(long numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Bookigs [uid=" + uid + ", fullName=" + fullName + ", mobileNo=" + mobileNo + ", selectDestination="
				+ selectDestination + ", numberOfPersons=" + numberOfPersons + ", travelType=" + travelType
				+ ", travelDate=" + travelDate + ", customerAddress=" + customerAddress + "]";
	}
    
}
