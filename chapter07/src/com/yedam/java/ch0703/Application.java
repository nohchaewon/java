package com.yedam.java.ch0703;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		for(int i =1; i<=5; i++) {
			int problemTire = car.run();
		
			switch(problemTire) {
			case 0: 
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1: 
				System.out.println("앞왼쪽 HankookTire교체");
				//frontLeftTire => Tire
				//frontLeftTire  펑크 => 자식 클래식인 HankookTire 교체
				//부모 클래스에서 오버라이딩 한 내용을 바꿔 끼우게 되는것 
				//자동 타입 변환으로 인해서 가능한 일 
				//HankookTire tire = new HankookTire("앞왼쪽",15);
				//car.frontLeftTire =tire 
				//위에 두줄이 밑에 있는 한줄로 쓴거 
				car.frontLeftTire =new HankookTire("앞왼쪽",15);
				break;
			case 2: 
				System.out.println("앞오른쪽 KumhoTire교체");
				car.frontRightTire =new kumhoTire("앞오른쪽",13);
				break;
			case 3: 
				System.out.println("뒤왼쪽 HankookTire교체");
				car.backLeftTire =new HankookTire("뒤왼쪽",14);
				break;
			case 4: 
				System.out.println("뒤오른쪽 KumhoTire교체");
				car.backRightTire =new kumhoTire("뒤오른쪽",17);
				break;
			}
			System.out.println("=================================");
		}
	}

}
