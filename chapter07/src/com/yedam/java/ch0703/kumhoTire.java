package com.yedam.java.ch0703;

public class kumhoTire extends Tire{

	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation <maxRotation) {
			System.out.println(location +"kumhoTire 수명"+(maxRotation-accRotation)+"회");
			return true;
		}else {
			System.out.println("###"+location +"kumhoTire 펑크 ###");
			return false;
		}
		// TODO Auto-generated method stub
		//return super.roll();
	}

	

}
