package com.yedam.java.ch0402;

public class ConditinonalStatementEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int x = 1;
		for (; x < 100; x = x + 15) { // for문 초기값, 조건식,증감식 안주면 무한루프
			System.out.println("출력");
		}
		System.out.println("x:" + x);

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0; // 변수를 하나를 추가하면 합을 구할수 있다
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i; 이렇게 두가지 방법 있다
		}
		System.out.println("1~100까지의 합:" + sum);

		// float 타입 카운터 변수
//		for(float f=0.1f; f<=1.0f; f+=0.1f) {
//			System.out.println(f);
//			}
		// 구구단 2~9단까지 출력
		for (int i = 2; i <= 9; i++) {
			// i = 0;
			System.out.println("***" + i + "단***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
				// i = 0 , j = 0;
				// j= 1; 0이였다가 1이 되고
			}
		}
		// while문

		// 1~10 까지 출력
		// 증감식이 어디에 있는냐 위치에 따라 답이 틀려지니까 주의해야한다
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++; // 증감식은 출력이 된후에 마지막에 넣는다
		}

		count = 0;
		while (count <= 9) { // count 1 적을경우 2부터 나온다 또 10을 할경우 11까지 나옴
			count++; // 증감식은 앞에 넣을경우 하나씩 빼야한다
			System.out.println(count);
		}

		// 1부터 100까지 출력, 1부터 100까지 합을 출력
		sum = 0; // 합을 위해 변수 선언
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count; // 증감식 전에 적여야한다 왜? 원래도 증감식은 결과를 하고 나온후 증감하니까
			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합:" + sum);

		// 주사위 두개를 굴리데 합이 3이 되는 경우까지 굴리는 경우

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}

		do {
			System.out.println("do ~ while 반복문이" + index + "번 실행됩니다.");
		} while (index != 1);

		// break 로 while 문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;
		}
		// 이중 for문에서 break문 사용
		for (char upper = 'A'; upper <= 'z'; upper++) {
			boolean result = false;
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					result =true;
					break;
				}
			}
			System.out.println("1)안쪽 for문 종료");
		}
		System.out.println("2)안쪽 for문 종료");
		
		System.out.println("-----------------------");
		
		Outter:for (char upper = 'A'; upper <= 'z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1)안쪽 for문 종료");
		}
		System.out.println("2)안쪽 for문 종료");
		
		//1~10 for문 짝수가 아닌 값 출력 
		for(int i=1; i<10; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
		System.out.println("-----------------------");
		//continue를 사용한 for문 
		for(int i=1; i<10; i++) {
			if(i % 2==0)continue;   //실제로 실행되는코드가 많은데 실행되지 않게 할때 많이 쓰인다 
			System.out.println(i);
		}
		
	}
}
