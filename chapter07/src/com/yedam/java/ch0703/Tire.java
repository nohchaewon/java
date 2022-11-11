package com.yedam.java.ch0703;

public class Tire {

	//필드 
	public int maxRotation; //최대 회전수(수명)
	public int accRotation; //누적 회전수
	public String location; //타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation =  maxRotation;
	}
	
	
	//메소드
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation ) {
			System.out.println(location +"HankookTire 수명"+(maxRotation-accRotation)+"회");
			return true;
		}else {
			System.out.println("###"+location + "HankookTire 펑크 ###");
			return false;
		}
	}
}
