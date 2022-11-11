package com.yedam.java.ch0701;
import com.tedam.jave.ch0702.Parent;

public class Child2 extends Parent{
	//필드
	
	//생성자
	
	//메소드
	
	void getInfo() { //protected는 아무리 다른곳에 있더라도 부모클래스한테 사용가능 
		System.out.println(firstName + lastName + bloodType +age);
	}
	
	
	
}
