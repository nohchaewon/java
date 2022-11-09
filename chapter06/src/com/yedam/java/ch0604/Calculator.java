package com.yedam.java.ch0604;

public class Calculator {
	
	 //계산기 만들기 
	void powerOn() {
		System.out.println("전원을 켭니다.");	
	}
	
	int plus(int x, int y){
		int result = x+y;
		return result;
	}
	 
	double divide(int x, int y){
		double result =(double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
		 double avg(int x, int y){
			int sum =plus(x,y);
			double result = sum /2.0;
			return result;
		}
		 
		 void execute() {
			 double result = avg(7,10);
			 println("실행결과 : rersult");
		 }
		 
		 void println(String message) {
			 System.out.println(message);
		 }
		 
		 //사각형의 넓이 구하기 
		 // 정사각형(값을 1개만 받으면 된다), 직사각형(가로,세로 받아와야한다)
		 //1)정사각형
		 double areaRectangle(double width) {
			 return width * width;
		 }
		 
		 //2)직사각형 
		 double areaRectangle(double width, double height) { //위치를 다르게하면 오류안뜬다
			 return width * height; 
		 }
	}

