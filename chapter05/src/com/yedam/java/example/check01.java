package com.yedam.java.example;

public class check01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//문제 1) 주어진 배열에 총합과 평균을 구하세요.
		int[] array = {10,53,26,85,75};

		
		int sum=0;       //크기에 작은게
		for(int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		System.out.println("총합:"+sum);
		double avg = sum/ (double)array.length;
		System.out.printf("평균:%.2f\n",avg);
		
		
		//문제2) 배열의 최대값과 최소값을 구하세요 
		int max=array[0];
		int min=array[0];
		
		for(int i=0; i<array.length; i++) {
			//최대값
			if(max <array[i]) {
				max =array[i];
			}
			//최소값
			if(min >array[i]) {
				min= array[i];
			}
		}
			
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		//문제3) 문제2번에서 구한 최대값과 최소값이 각각 몇번쨰 값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			//최대값
			if(max ==array[i]) {
				maxIndex = i;
			}
			//최소값
			if(min ==array[i]) {
				minIndex = i;
			}
		} 
		System.out.println("최대값:"+max +"는"+(maxIndex+1)+"번째입니다.");
		System.out.println("최소값:"+min +"는"+(minIndex+1)+"번째입니다.");
		
	}

}
