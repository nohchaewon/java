package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		//자동 타입변환
		byte byteValue = 10;
//		char charValue = byteValue;
		int intValue = byteValue;
		System.out.println("intValue :" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue :" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:"+ longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("longValue:"+ longValue);
		
		floatValue = 100.5F;
		double doubleValue = longValue;
		System.out.println("doubleValue:"+ longValue);
		
		//강제타입변환
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; //변수끼리 못한다
		byte result3 = (byte)(x + y);  //byte 강제로 바꾸는거지만 잘 없다
		System.out.println(result2 + ","+ result3);
		
		char charValue1 = 'A'; //65
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드:" + intResult);
		System.out.println("출력문자:" + (char)intResult);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long longResult = value1 + value2 + value3;
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1;
		
		int intVar1 = 10;
		//int resultVar1 = intVar1/4;   //결과 :2     int / double 차이 
		double resultVar1 = intVar1/4.0;   //둘중에 하나를 실수로 바꿔준다 10.0 / 4.0 => 2.5    실수를 바꾸지 않을때(정수) 결과 : 2.0
		System.out.println("10/4 결과는:" + resultVar1);  
		
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1 / y1;   //x,y 중에 앞에 하나를 double 만들거나 두개다 주기 
		System.out.println("1/2 결과 :" + result1);
		
		//문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);       //똑같은 결합인데 위치에 따라서 및 "" 에 따라서 달라진다
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + ( 2 +8 );
		System.out.println(str4);
		
		//기본 타입 <-> String 
		int aVar = Integer.parseInt("10");  
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a:" + aVar);
		System.out.println("b:" + bVar);
		System.out.println("c:" + cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" +105.23;
		System.out.println(strV4);

		
	
	}


}
	

