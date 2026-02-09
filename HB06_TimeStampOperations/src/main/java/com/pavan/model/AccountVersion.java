package com.pavan.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountVersion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;

	private Long accountNo;

	private String aName;

	private String IfscCode;

	private LocalDate dob;// only the date month year will be there in the LocalDate

	@CreationTimestamp
	private LocalDateTime createdAt; 
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedAt;
	
	

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "AccountDetails [sNo=" + sNo + ", accountNo=" + accountNo + ", aName=" + aName + ", IfscCode=" + IfscCode
				+ ", dob=" + dob + ", createdAt=" + createdAt + ", lastUpdatedAt=" + lastUpdatedAt + "]";
	}
	
	

}
