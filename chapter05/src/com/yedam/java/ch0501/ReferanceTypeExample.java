package com.yedam.java.ch0501;

public class ReferanceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null과 NullpointerException  : 내가 동작할게 없다
		String str = null; //동작하기 전까지는빨간줄 안뜬다 왜?  자바형식때문에 
		//System.out.println("길이:" + str.length());
		
		//String(문자열)비교
		 String strVar1 = "신미철";
		 String strVar2 = "신미철";
		 
		 if(strVar1 == strVar2) {
			 System.out.println("strVar1과 syrVar2는 참조가 같음");
		 }else {
			 System.out.println("strVar1과 syrVar2는 참조가 다름");
		 }
		System.out.println("------------------------------");
		//다른방식으로 해야함
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2가 문자열이 같음");
		}
		//객체가 정석적으로 가지는 방법
		System.out.println("------------------------------");
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");
		if(strVar3 ==strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar는 문자열이 같음");
		}
	
	
	
	
	}
	

}
