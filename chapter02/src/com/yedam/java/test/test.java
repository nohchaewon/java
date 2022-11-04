package com.yedam.java.test;

public class test {

	public static void main(String[] args) {
		  //1.
		      int num1=37;		    	
		  	  int num2= 91;
		      System.out.println(num1);
		      System.out.println(num2);
		  //2.
		     //2.1 (더하기)
		     byte x =37;
		     byte y =91;
		      
		      int result1 = x + y;

		     System.out.println(result1);
//		      //2.2 (빼기)
		      int result2 = y - x;
		      System.out.println(result2);
//		      //2.3 (곱하기)
		      int result3 = x * y;
		      System.out.println(result3);
//		      //2.4 (나누기)
		      int result4 = y / x;
		      System.out.println(result4);
		     
		     //byte < short < int < long < float < double
		     //3-1
		     int var1 = 128;
		     System.out.printf("%d\n",var1 );
		     
		     //3-2
		     String var2 = "B";
		     System.out.printf("%s\n",var2);
		     
		     //3-3
		     char var3 = 44032;
		     System.out.printf("%s\n",var2);
		     
		     //3-4
		     long var4 = 100000000000l;
		     System.out.printf("%d\n",var4 );
		     //3-5
		     double var5 = 43.93106;
		      System.out.printf("%f \n",var5);
//		      
		     //4
		     byte a = 35;
		     byte b = 25;
		     int c = 463;
		     long d = 1000L;
		     
		     long result1 = a + c +d;
		     System.out.println(result1);
		     
		     int result2 = a +b +c;
		     System.out.println(result2);
		     
		     double e = 45.31;
		     double result3 = c + d + e;
		     System.out.println(result3);
		     
		     //5
		     //출력예시) A278번지10.0
		     int intValue1 = 24;
		     int intValue2 = 3;
		     int intValue3 = 8;
		     int intValue4 = 10;
		     char charValue = 'A';
		     String strValue = "번지";
		     
		     String str1 =charValue +String.valueOf(intValue1 +intValue2) + intValue3 + strValue+ (float)intValue4;
		     System.out.println(str1);
		     
		     //6
		     int value = 485;
		     int value1 = 4 + 8+ 5;
		     System.out.println(value1);
		     
		     
		  }
		 
		 
	}


