package com.yedam.java.ch0604;

public class Computer {
	int sum1(int[] values) { //매개변수는 타입만 선언하면 된다 
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}	
		int sum2(int...values) {
			int sum =0;
			for(int i=0; i<values.length; i++) {
				sum+= values[i];
			}
			return sum;
	}
}
