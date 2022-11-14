package com.yedam.java.ch0801;

public class DriveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);   //시행하게 되면 => Driver 에서 vehicle 로 가서 run이 실행된다.
		driver.drive(taxi);  //시행하게 되면 => Driver 에서  vehicle에서 상속받고 있으니 run이 실행된다.
		
		Vehicle vhc =new Bus();
		
		vhc.run();
		//vhc.checkFare();
		
		//강제 타입 변환
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		//객체 타입 확인 
		//instanceof();
		
		driver.drive(bus);  //1) Driver 에서 vehicle 로 들어가서 참으로 가서 물어본다 bus.checkFare(); 확인이 되면 참이면 간후 run 
		driver.drive(taxi); //2)
	
		
		
		
	}

}
