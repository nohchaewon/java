package com.yedam.java.ch0601;

public class SmartPhone {

	//필드: 해당 클래스의 정보들을 저장하는 공간
	//아이폰6,갤럭시,울트라, 삼성,애플,가격등등
	String name;
	String maker;
	int price;
	
	//생성자 : 안만들어도 재생되는경우는 자바에서 기본값을 줘서 
	        //생성자를 넣으면 생성자를 기준으로 객체를 만들어야한다 
	
	
	
	//메소드
	void call() {
		System.out.println(name +"전화를 겁니다");
	}
	
	void hangUp() {
		System.out.println(name+"전화를 끊습니다");
	}
}
