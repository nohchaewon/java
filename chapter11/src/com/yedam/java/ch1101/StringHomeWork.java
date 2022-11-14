package com.yedam.java.ch1101;

public class StringHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제1번
		String input = "a.b.c";
		
		 for (int i = input.length()-1; i>=0; i--){
	            System.out.print(input.charAt(i));
	        }
		
		//문제2번 문자열 개수 세기
		
		 String str ="1a2v4b";  //숫자3개, 영어3개
		 int count = 0;
		 String str1 = "a";
		 for(int i = 0; i<=str1.length();i++) {
			 System.out.println(str1);
		 }
		 
		}
		
	}


