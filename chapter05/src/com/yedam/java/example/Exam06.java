package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//책 p202문제 6번
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] scores =null; //내부에 선언하면 안된다
		int studentNum = 0;
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택>");
			
			//숫자를 이용해서 넣을때 만들엊운다 
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {  //반복문에서서는 쓸떄 주의해야한다 
			case 1:
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int [studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("score["+i+"]>");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] =score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
				break;
			case 4: //최소값, 최대값, 평균을 구한다~
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					//최고값 구할때는 비교 먼저 
					if(max < scores[i]) { //max 보다 큰지 구해야한다
						max = scores[i];
					}
					//총합
					sum += scores[i];
					
				}
				System.out.println("최고 점수:" +max);  
				System.out.println("평균:"+((double)sum/scores.length));
								//정수로 나눌때 주의 둘중에 하나는 실수로 표기해야한다
	
				break;
			case 5:
				run = false;
				System.out.println("프로그램종료");
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
			
			
			
		}
		
		
	}

}
