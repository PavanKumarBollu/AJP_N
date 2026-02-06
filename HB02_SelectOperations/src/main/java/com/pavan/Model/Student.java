package com.pavan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	
	@Id
	private Integer sId;
	
	private String sName;
	
	private Integer sAge;
	
	private String cName;
	
	
	
	
	public Student()
	{
		System.out.println("Hibernate callled default constructor for creating the object");
	}


	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}


	public String getcName() {
		return cName;
	}




	public void setcName(String cName) {
		this.cName = cName;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", cName=" + cName + "]";
	}
	
	
	
	

}
