package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 128;    //넘어서는 순간 오류  
		System.out.println(var1);
		//System.out.print(var5);
	
		long var6 = 10000000000L;  //long 이여도100000 먼저보고 int 밖에 못봤는데하면서 허용범위 벗어나면 오류 L(대문자) 붙이기
		long var7 = 100000;    
		
		//char 타입
		char v1 = 65;
		char v2 = '가';    //문자
		int v3 = v1;   //또다른 정수타입에 옮길수 있다
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//String
		String name = "홍길동";  //문자열 리터럴 
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		// char VS String 
		//char v4 = 'A';  // " "(큰따움표) 한글자 인지 못한다 무조건 따움표로  		
		String v5 = "A";  //''홀따움표로 하면 인지 못한다  
		
		String str1 = "누군가 \"안녕\"하면서 인사했다.";   //역슬라이스 넣기 *이스케이프 문자하는법
		
		//float
		float num1 = 3.14f;   //f를 붙이지 않으면 인지 못한다 
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789f;
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean 
		
		boolean stop = ( 1>2);
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}
	
}
