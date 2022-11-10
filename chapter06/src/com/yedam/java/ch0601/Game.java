package com.yedam.java.ch0601;

public class Game {

	
	//필드
	//객체를 만든다 라고하면 (인스턴스)화 된다라고 한다 
	//인스턴스 필드 
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;
	
	//생성자
	public Game() {
		
	}
	public Game(String id) {
		this.id = id;   //같은이름 생성자라도 내가 원하는 타입데이터를 지정할수있다
	}					//오버로딩: 이름같은 생성자라도 다른타입데이터를 말한다
	public Game(double passWd) {
		
	}
	public Game(String id, String passWd) {
		
	}
	
	//메소드
	void getInfo() {
		System.out.println("GameName:" +gameName);
		System.out.println("id:"+id);
		System.out.println("password:"+passWd);
	}
	
	void getInfo(String temp) {
		
	}
	
	
}
