package com.yedam.java.homework;

public class Human {
	//필드
	public String name;
	public int kg;
	public int he;
	
	//초기값
	Human(String name, int kg,int he){
		this.name=name;
		this.kg=kg;
		this.he=he;
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






	//메소드 
	public void getInformation() {
		System.out.println("이름:"+name);
		System.out.println("몸무게:"+kg);
		System.out.println("키:"+he);
	}
}

