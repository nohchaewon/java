package com.yedam.java.ch1101;

public class SystemExample {

	public static void main(String[] args) {
		
		//System.exit();  프로그램 끄는거 
//		for(int i =0; i<10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				System.exit(0);
//			}
//		}
//		
//		System.out.println("프로그램 종료");  //출력 되지도 않음 

		//현재 시각 읽기
		
		long time1 = System.nanoTime();  //스탑워치 같은거 시작하는점!!!  15시31분 00:00:00 시간 확인하고
		
		int sum = 0;
		for(int i=1; i<100000; i ++) {
			sum +=1;
		}
		long time2 = System.nanoTime();  //시간읽는것을 그만하겠습니다   15시32분 00:00:00 시간 확인하고
		System.out.println("sum :"+ sum);
		System.out.println("계산 시간:" +(time2-time1)+"나노초가 소요됨"); //얼나마 소요된지 확인 :(time2-time1)
	
		long time3 = System.currentTimeMillis();  //현재시간 불러옴 
		System.out.println(time3);
	
	
	}

}
