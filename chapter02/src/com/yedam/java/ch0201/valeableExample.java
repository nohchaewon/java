package com.yedam.java.ch0201;

public class valeableExample {
	public static void main(String[] args) {
		// 2022 년 11월 03일  한줄주석처리 
		/* 변수의 
		   사용 범위*/
		
		int value1 = 15;
		
		if(value1 > 10) {
			int value2;   //변수를 선언했지만 위치가 잘못되어 오류 어디까지인지 잘 확인하고 해야함 
 			value2 = value1 - 10;
 			int result = value1 + value2 +5;
		
		System.out.print(value1 +"," + value2 +","+ result);
 			/***/
 			int v1 = 0;
 			if(v1 == 0) {
 				v1 = 1;
 				int v2 = 0;
 				if(v2 == 0) {
 					v2 = 2;
 					int v3 = v1 + v2;
 						System.out.print(v1 + "+" + v2 + "="+ v3);
 					}
 			}System.out.print(v1 + "+" + v2 + "="+ v3);
		}System.out.print(v1 + "+" + v2 + "="+ v3);
	}
}