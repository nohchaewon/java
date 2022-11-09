package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		System.out.println("장동차가 동작 중입니다.");
		System.out.println("최대 스피드:"+ car1.maxSpeed);
		System.out.println("색깔:"+ car1.color);
		car1.run();
		
		
		System.out.println();
		
		Car car2 = new Car();  //new면 새로운 calss 만들어 낸다! 위에랑 똑같은 값이라도 다른 객체이다 
		System.out.println("최대 스피드:"+ car2.maxSpeed);
		System.out.println("색깔:"+ car2.color);
		car2.run();
		
		if(car1==car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		}else{
			System.out.println("car1과 car2는 다른 객체를 참조합니다.");
		}
		
	}

}
