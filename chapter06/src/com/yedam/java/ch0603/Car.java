package com.yedam.java.ch0603;

public class Car {
		//필드 
		String company = "현대자동차";
		String model = "그랜저";
		String color = "검정";
		int maxSpeed = 350;
		int speed;
		
	
		//생성자
//		public Car(String model, String color) { //생성자를 통해 불러올수 있다
//			 this.model = model;     //this : 명확하게 인스턴스를 가르킨다 ex)얘에 해당되는것 이것입니다~
//			 this.color= color;
//		}
		public Car() {
			
		}
		
		public Car(String model) {
			//this.model = model;
			this(model,"은색",250);
		}
		
		public Car(String model, String color) {
			//this.model = model; 
			//this.color= color;
			//System.out.println("인스턴스를 생성했습니다. ");
			this(model, color, 250); //첫줄에 호출가능 윗줄에 다른걸 적으면 오류 뜬다 
		}
		
		public Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color =color;
		this.maxSpeed =maxSpeed;
		}
}
