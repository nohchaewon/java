package com.yedam.java.ch0801;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementcl impl = new Implementcl();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();   //상속받아서 A,B,C 3가지 사용 가능 
		ic.methodB();
		ic.methodC();   
		
		
	}

}
