package com.yedam.java.ch0703;

public class Application4 {
	public static void main(String[] args) {
		
		B b= new B();
		C c = new C();
		//상속관계 : c -> b 
		//상속관계 : b -> a 
		//상속관계 :c -> b-> a  
			//손자 -> 아빠 -> 할아버지 
		
		A a1 =b;
		A a2 = c;
		
		
		
		
	}
}
