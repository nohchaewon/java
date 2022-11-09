package com.yedam.java.ch0602;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(); // 인스턴트 만든다

		System.out.println("제작회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색깔:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeen);
		System.out.println("현대속도:" + myCar.speed);

		myCar.speed = 60;
		System.out.println("수정된 속도:" + myCar.speed);

		Car newCar = new Car();
		System.out.println("새로운 차의 현재속도:" + newCar.speed);

		//기본생성자가 아닌 또다른 생성자가 존재한다 
		String str = new String("Con");
		
	}

}
