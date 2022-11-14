package com.yedam.java.ch0801;

public class MyclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1)------");
		//RemoteControl rc = new Television();
		Myclass mc = new Myclass();
		mc.rc.turnnOn();
		mc.rc.tuenOff();
		
		System.out.println("2)------");
		//RemoteControl rc = new Audio();
		Myclass mc2 = new Myclass(new Audio());
		//rc.turnOn();  얘들을 쓴것이다 
		//rc.turnOff();
		
		System.out.println("3)-------");
		
		Myclass mc3 = new Myclass();
		mc3.methodA();
		//rc.turnOn();  얘들을 쓴것이다 
		//rc.turnOff();
		
		System.out.println("4)------");
		//RemoteControl rc = new Television();
		Myclass mc4 = new Myclass();
		mc4.methodB(new Television());
		//rc.turnOn();  얘들을 쓴것이다 
		//rc.turnOff();
		
	}

}
