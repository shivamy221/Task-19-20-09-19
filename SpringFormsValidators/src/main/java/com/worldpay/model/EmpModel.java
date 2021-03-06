package com.worldpay.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class EmpModel {
	
	@Id
	private int eno;
	@Pattern(regexp = "[A-za-z]*",message = "Enter valid Aphabetic name")
	@Size(min=4,max=20)
	private String ename;
	private int sal;
	
	public EmpModel(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public EmpModel() {
		super();
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpModel [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
		
	}
}
