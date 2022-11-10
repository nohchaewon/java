package com.yedam.java.ch0601;

public class Singleton {
	//싱글톤 :패턴이라고 한다 
	//전체의 프로그램중에서 단 하나의 객체만 단들도록 보장하는 코딩 기법
	private static Singleton singleton = new Singleton(); //요게 단 하나의 객체
											
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { 
		return singleton; //singleton 반환하는거 
			//singleton = new Singleton(); 
	}
	
	
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}
	public void connectDB() {
		System.out.println("데이터베이스 연결합니다.");
	}
}
