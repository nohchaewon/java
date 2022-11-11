package com.yedam.java.homework;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDept empdept = new EmpDept(null, 0);
		
		empdept.name="이지나";
		empdept.money=3000;
		empdept.Department="교육부";
			
		empdept.getInformation();
		empdept.print();
	}
	
	Human human = new Human(null, 0, 0, 0);
	
	
	
}
