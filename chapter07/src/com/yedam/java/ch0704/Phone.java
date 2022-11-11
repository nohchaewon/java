package com.yedam.java.ch0704;

public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 킵니다. ");
	}
	
	public void turnOff() {
		System.out.println("전원을 끔니다. ");
	}
	
}
