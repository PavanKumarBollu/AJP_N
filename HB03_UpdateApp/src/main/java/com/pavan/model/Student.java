package com.pavan.model;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate(value = true)
public class Student {
	
	@Id
	private Integer sId;
	
	
	private String sName;
	
	
	private Integer sAge;
	
	
	private String cName;
	
	
	// this constructor has to be there compulsorly beacuase hibernate internally uses this constructor for building the object
	public Student() {
		super();
		System.out.println("Hiber nate called this constructor");
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
