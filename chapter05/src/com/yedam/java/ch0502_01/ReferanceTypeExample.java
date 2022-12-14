package com.yedam.java.ch0502_01;

public class ReferanceTypeExample {

	public static void main(String[] args) {

		

		// 배열을 선언 -> 모든 타입을 값으로 가질수 있음
		//int[] intAry = null; // intAry : 객체이다
		// System.out.println("intAry[0]"+intAry[0]);
		// 값을 초기화하며서 배열을 생성
		//nt[] scores = { 83, 90, 97 }; // 자바에서는 {} 잘 사용안한다

		User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;

		/*
		 * 자바에서는 이렇게 줄수 없다 let user = { name: '홀길동', age : 25, height : 175.7 }
		 */

		int[] intAry = null;
		// System.out.println("intAry[0]"+intAry[0]);
		// 값을 초기화하며서 배열을 생성
		int[] scores = { 83, 90, 87 };  

		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);

		int sum=0;
		for (int i = 0; i< 3; i++) { 
			//i<=3 작성시 오류 나온다 index를 벗어낫다
			sum += scores[i];
		}
		System.out.println("총합:" +sum);
		double avg = sum / 3.0;
		System.out.println("평균:" + avg);

		// 주의사항
		int[] scoreList = null; // 변수를 선언하고 값을 주는것은 불가능
						// 내가원하는데로 주고싶으면 new연산자 작성해야한다
		scoreList = new int[] { 83, 90, 87 }; // 내가 준 값을 기반으로 하고싶으면 빈공간넣기 이때는 크기 주면 안된다 ex)[5]
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum +scoreList[i];
		}
		System.out.println("종합:"+sum);
		
		sum =add(new int[] {83,90,87});
		
		//new 연산자로 배열 생성 
		int[] array = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("array["+i+"] :"+array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i=0; i<strAry.length;){
			strAry[i] = String.valueOf(i);
		}
	
		
	for(int i=0; i<strAry.length; i++){
		System.out.println("strAry[+i+]:" + strAry[i]);
	}

	private static int add(int[] numList) {
		int sum = 0;
		for (int i =0; i <numList.length; i++) {
			sum+= numList[i];
		}
		return sum;
	
}
	

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}
}