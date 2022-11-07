package com.yedam.java.ch0401;

public class CoditionalStatementSubject {

	public static void main(String[] args) {
		//문제 1) 두개의 정수가 주여졌을 때 
		//		두 정수의 합이 자연수이면 
		//		'Natural Number'를 출력하는 코드를 작성하세요

		int a = 1;
		int b = 3;
		
		if (a +b >0) {
			System.out.println("Natual Number");
		}
		
		//문제 2) 두개의 정수가 주어졌을때
		//		두수의 대소관계에 따라서 부등호를 출력할수 있도록 출력하는 코드 
		
		if(a >b) {
			System.out.println(">");
		}else if (a == b) {
			System.out.println("=");
		}else 
		 System.out.println("<");
	}

//	double weight = 55.5;
//	double height = 1.68;  
//	double bmi = weight /(height * height);
//	
//	if (bmi >= 30) {
//		System.out.println("비만 입니다");
//	}else if(bmi >= 25) {
//		System.out.println("과체중 입니다");
//	}else if(bmi >= 18.5) {
//		System.out.println("정상체중입니다");
//	}else {
//		System.out.println("저체중입니다");
//	}
//	//문제 4) 선택한 단의 6번째 값을 출력하는 코드 
//	//		예를 들어, 2단일 경우 2x6 12
//	// 단, 출력문에는 변수를 사용하지 않는다. 
//	
//	int num =(int) (Math.random()*9)+1;    //2단에서 5 까지만 하겠다 (*4 )+2
//	
//	switch(dan) {
//		System.out.println();
//		case 1:
//			System.out.printf("%d x6 = %d\n" 1, 1*6);
//			break;
//		case 2:
//			System.out.printf("%d x6 = %d\n" 2,2*6);
//			break;
//		case 3:
//			System.out.printf("%d x6 = %d\n" 3,3*6);
//			break;
//		case 4:
//			System.out.printf("%d x6 = %d\n" 4,4*6);
//			break;
//		case 5:
//			System.out.printf("%d x6 = %d\n" 5,5*6);
//			break;	
//		case 6:
//			System.out.printf("%d x6 = %d\n" 6,6*6);
//			break;
//		case 7:
//			System.out.printf("%d x6 = %d\n" 7,7*6);
//			break;
//		case 8:
//			System.out.println("%d x6 = %d\n" 8,8*6);
//			break;
//		case 9:
//			System.out.println("%d x6 = %d\n" 9,9*6);
//			break;
//		}
//	
//	//문제 5) 다음과 같이 점수 범위에 따라 등급을 구분 
//		//  해당 점수에 대한 등급을 출력하는 코드 
//		// 90 이상 100점 이하 : A -> 90,91,...100
//	 	// 80 이상 70 미만 : B -> 80,81,82,...89
//		// 70 이상  80 미만 : C -> 70,71,...79
//		// 60 이상 70 미만 :D  -> 60,61,...69
//		// 60미만 E 
//
//		double score = 75.6;
//	
//		switch((int)(score/10)){
//		case 10: 
//		case 9:
//			System.out.println("A등급입니다.");
//		break;
//		case 8:
//			System.out.println("B등급입니다.");
//		break;
//		case 7: 
//			System.out.println("c등급입니다.");
//		break;
//		case 6: 
//			System.out.println("D등급입니다.");
//		break;
//		default:
//			System.out.println("E등급입니다.");
//		}	
//}
}