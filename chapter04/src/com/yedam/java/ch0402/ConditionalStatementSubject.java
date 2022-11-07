package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 책 p161 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// *****
		// 첫번째 방식 가장많이 쓰인다
		String tree = "";
		for (int i = 1; i <= 5; i++) {
			tree += "*";
			System.out.println(tree);
		}
		// 두번째 :방식 변수 선언 안하고 하는 방식
		for (int i = 1; i <= 5; i++) { // line
			for (int j = 1; j <= i; j++) { // "*"출력
				System.out.println("*");
			}
			System.out.println();
		}

		// 문제2) for문을 이용해서 1부터 100까지의 정수중에서 2의 배수가 아닌 숫자의 갯수를 구하세요
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			count++;
		}
		System.out.println(count);

		// 문제 3) 책 p161 4번
		// 중첩 for문을 이용하여 방정식 4x 5y=60의 모든해 중
		// 첫번쨰로 구해지는 값을(x,y)형태로 출력
		// 단, x와 y는 10이하의 자연수 입니다.

		// 1) 중첩 for문, 2)x, y 는 1~10 정수
		Outter: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println(x + "," + y);
					break Outter;
				}
			}

		}
		//문제 4) do ~ while 문과 Math.random() 함수를 이용
		// 		1~10 의 정수 중 7이라는 수가 나올때까지 숫자를 출력
		while(true) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
			if(num == 7) {
				break;
			}
		}
		
		//교수님 한것 
		int num =0;
		
		do{
			num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}while(num != 7);
		
		//문제5) p161 3번문제 
		// 		while문과 Math.random() 함수를 이용
		//		2개의 주사위를던졌을때 숫자를 (숫자1, 숫자2)로 출력 
		//		숫자의 합이 5일 경우 종료, 아닌경우에 계속 던짐 
		//		최종으로 주사위를 몇번 던졌는지 횟수로 출력
		//		숫자의 합이 5가 되는 조함( 1,4)(4,1)(2,3)(3,2)

		int total = 0;
		while (true) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			total++;
			System.out.printf("(%d, %d)\n", x, y);
			if (x + y == 5) {
				break;
			}
		System.out.println("주사위를 던진 횟수는 총" + total + "번 입니다.");

		}
	}
}