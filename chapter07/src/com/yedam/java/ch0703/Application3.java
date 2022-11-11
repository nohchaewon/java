package com.yedam.java.ch0703;

public class Application3 {
	
 public static void method1(Parent parent) {
	 if(parent instanceof Child) {
		 Child child = (Child) parent;
		 System.out.println("method1 -child 변환성공");
	 }else {
		 System.out.println("변환 실패");
	 }
 }

 	public static void method2(Parent parent) {
 		Child child = (Child)parent;
 	System.out.println("method1 -child 변환성공");
 	}
 	
 	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB =new Parent();
		method2(parentB);
		
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		//bus, taxi -> 부모 클래스 vehicle 
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver.drive(vehicle vehicle = new Bus()) 
		driver.drive(bus);
		driver.drive(taxi);
		
		
		Animal animal = null;
		
		animal = new Cat();
		
		animal.speak();
		
		animal = new Dog();
		
		animal.speak();
		
		
		Parent parent = new Child();
		
		parent.field ="parent";
		parent.method1();
		parent.method2();
		
		//casting : 강제 타입변환 
		//parent.field2 = "child"
		//parent.method3();
		
		//casting
		Child child = (Child)parent;
		child.field2 = "child";
		child.method3();

		child.field = "parent";
		
		
		
		
		
	}

}
