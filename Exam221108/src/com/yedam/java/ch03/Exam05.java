package com.yedam.java.ch03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] dice = null; //주사위의 각 숫자별로 몇번씩 나온지 기록하는거 
							//index -> 변동 불가능 
							//각 index별로 가지는 값 => 변동 됨 
							// => 각 숫자가 가지는 횟수 누가? 주사위가 
		
		int size = 0;
		while (run){
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과보고 4.가장많이 나온수 5. 종료");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 주사위 크기 입력
				System.out.println("주사위 크기>");
				size = Integer.parseInt(sc.nextLine());
				if (size >= 5 && size <= 10) {
					dice = new int[size];
				} else {
					System.out.println("주사위 크기는 5~10 사이만 가능합니다.");
					size = 0;
				}
			} else if (selectNo == 2) { // 주사위 굴리기 ->주기능
				int count =0;
				while (true) { //index 는 내가 아는 숫자에 1을 뺀거다  
					int num = (int)(Math.random() * size) + 1;
					count++;
					dice[num-1] = dice[num-1] + 1;
					if (num == 5)break;
				}
				System.out.println("5가 나올때 까지 주사위를" +count+ "번 굴렀습니다.");
			} else if (selectNo == 3) { // 결과보기
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1)+"은"+dice[i]+"번 굴렀습니다.");
				}
			} else if (selectNo == 4) { // 가장 많이 나온수
				int maxCount =dice[0]; //나온횟수
				int maxIndex = 0; //나온수 (인덱스)
				for(int i=0; i<dice.length; i++){
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex= i;
					}
				}
				System.out.println("가장 많이 나온수는 "+(maxIndex+1)+"입니다.");
			} else if(selectNo == 5) { // 종료
				run = false;
			} else {
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}
		}
	}

}

