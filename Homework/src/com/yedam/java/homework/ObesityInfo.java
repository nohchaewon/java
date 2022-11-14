package com.yedam.java.homework;

public class ObesityInfo extends StandardWeightInfo{
	public double obesity;
	ObesityInfo(String name, int kg, int he) {
		super(name, kg, he, he);
		// TODO Auto-generated constructor stub
	}
	public void getInformation() {
	 	
		if(obesity>25) {
			System.out.println(name+"님의"+"신장"+he+","+"몸무게"+kg+getobesity());
		}else {
			System.out.println(name+"님의"+"신장"+he+","+"몸무게"+kg+","+"비만입니다.");
		}
 }
 private double getobesity() {
		// TODO Auto-generated method stub
		return obesity;
	}

}
