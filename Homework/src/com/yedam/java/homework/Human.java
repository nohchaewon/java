package com.yedam.java.homework;

public class Human {
	//필드
	public String name;
	public int kg;
	public int he;
	public int bmi;
	
	//초기값
	Human(String name, int kg,int he, int bmi){
		this.name=name;
		this.kg=kg;
		this.he=he;
		this.bmi=bmi;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getKg() {
		return kg;
	}



	public void setKg(int kg) {
		this.kg = kg;
	}



	public int getHe() {
		return he;
	}



	public void setHe(int he) {
		this.he = he;
	}



	public int getBmi() {
		return bmi;
	}



	public void setBmi(int bmi) {
		this.bmi = bmi;
	}



	//메소드 
	public void getInformation() {
		System.out.println("이름:"+name);
		System.out.println("몸무게:"+kg);
		System.out.println("키:"+he);
		System.out.println("비만도:"+bmi);
	}
}

