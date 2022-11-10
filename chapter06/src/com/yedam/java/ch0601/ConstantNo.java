package com.yedam.java.ch0601;

public class ConstantNo {
	//필드
	static final double pI =3.14;   //final 들어가면 대문자를 써야한다 /불변의 상속 
	static final int EARTH_Round = 46250;
	static final int LIGHT_Spped = 127000;
	
	String words = "This is Java";
	char word = 'Y';
	//생성자
	
	//메소드
	// static간에 필드 사용 
	static void getCircle(int radius) {
		//원 넓이 pi * r * r   
		System.out.println("원 넓이:"+(pI*radius*radius));
		
	}
	//메소드에 static 필드 호출 
	public void allData() {
		double result = pI +EARTH_Round +LIGHT_Spped;
		System.out.println(result);
		getCircle(1);
		
	}
	//static 메소드에 일반 필드, 메소드 사용 
	public static void words() {
		//String gatWord = words + String.valueOf(word);  이렇게 사용시 오류난다
		
		
		
	}

}
