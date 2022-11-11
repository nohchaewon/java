package com.yedam.java.homework;

public class EmpDept extends Employee {
	EmpDept(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}

	public String Department;

		// TODO Auto-generated constructor stub
	
	
//필드 

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public void getInformation() {
		System.out.println("부서:"+Department);
		super.getInformation();
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
		
	}


	
	
	
}

