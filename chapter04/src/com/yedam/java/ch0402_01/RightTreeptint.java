package com.yedam.java.ch0402_01;

public class RightTreeptint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 책 p161 6번문제
		//     * ->1번쨰줄, 공백3개,별1개 ->총문자 4개
 		//    ** ->2번째줄, 공백2개,별2개 ->총문자 4개
		//	 *** ->3번쨰줄, 공백1개,별3개 ->총문자 4개
		//  **** ->4번쨰줄, 공백0개,별4개 ->총문자 4개
		
		for (int i = 1; i <= 4; i++) { // 라인 표시(line)
			for (int j = 1; j<= 4; j++) { // 문자수
				if (j <= (4-i)) { //공백표기하는 
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
