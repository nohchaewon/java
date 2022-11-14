package com.yedam.java.homework;

public class StandardWeightInfo extends Human{

	StandardWeightInfo(String name, int kg, int he) {
		super(name, kg, he);
		// TODO Auto-generated constructor stub
	}

	 public void getInformation() {
		 	System.out.println("이름:"+name);
			System.out.println("몸무게:"+kg);
			System.out.println("키:"+he);
	 }
	 public double getStandardWeight() {
		int height;
		Object StandardWeight = (height-100)*0.9);
		return  (double) StandardWeight;
	 }
}
