package com.yedam.java.homework;

public class Employee {
	
	//필드
	
	
	public String name;
	public int money;
	
	//초기값 
	Employee(String name, int money){
		this.name=name;
		this.money=money;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
//메소드
	public void getInformation() {
		System.out.println("이름:"+name);
		System.out.println("연봉:"+money);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
}
