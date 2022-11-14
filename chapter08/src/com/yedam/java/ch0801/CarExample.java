package com.yedam.java.ch0801;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car myCar =new Car();
		
		myCar.run();
		
		System.out.println("#########");
		
		myCar.frontLeftTire = new MichelineTire();
		myCar.frontRightTire = new MichelineTire();
		
		myCar.run();
	}

}
