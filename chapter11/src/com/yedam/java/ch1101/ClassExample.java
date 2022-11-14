package com.yedam.java.ch1101;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//Key 클래서 객체 가져오기
		//1탄 - 직접 클래스 객체 가져오기
		Class clazz = Key.class;
				//예약어 class 객체로 못사용 
		System.out.println(clazz);
		
		//2탄
		Class clazz2 =Class.forName("com.yedam.java.ch1101.Key");
		
		System.out.println(clazz2);
		
		//3탄 = 객체로부터 클래스 객체 얻기
		
		Key key = new  Key(1);
		
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("다운로드.jpg").getPath();
		System.out.println(photoPath);
	}
	
	
}
