package com.yedam.java.ch0801;

public class Myclass {

	//필드
	//1) 
	//public int a = 1; 참조타입도 넣을 수 있다
	RemoteControl rc = new Television();

	//생성자
	public Myclass() {
		
	}
	public Myclass(RemoteControl rc) {
		this.rc = rc;
		rc.turnnOn();
		rc.tuenOff();
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnnOn();
		rc.tuenOff();
	}
	void methodB(RemoteControl rc) {
		rc.turnnOn();
		rc.tuenOff();
	}
	
}
