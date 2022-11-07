package com.yedam.java.ch0401;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		//기본 if문 
		int score = 90;
		
		if(score>= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		System.out.println("if문 상관없이 실행됩니다.");
		
		if(score < 90)               // { }<-중괄호 한개까지는 더 묶어준다 하지만 2개이상은 오류 하지만 그냥 각자 다 묶어라
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		
		// if ~else 문 / else: 조건추가되는것에 적용하는건데 if랑 다르다 할때 사용
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		//if~else if~else문 -점수에 따라 등급을 분류할때 
		//범위를 잘 생각해야한다 
		//순차적인지 정렬한후 잘라내야한다 
		if (score >=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score >= 80) { //score <90 && score >=80
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score >=70) { //score <80 && score >=70
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다.");
		}else { //나머지 기타에 해당 score <70
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		/*
		 1) 0.0 <= Math.random() <1.0    0.0 부터 1.0이 되기전까지  
		 2) 0.0 * 10 <= Math.random() *10 < 10.0 * 10
		 3) (int) 0 <= (int) (Math.random() *10_ <(int) 10
		 4) (int) 0 + 1 <= (int)(Math.random() *10 ) + 1 < 10 + 1
		 5) 위에 변경을 하면 결과 값이: 1,2,3,4,5,6,7,8,9,10 
		   
		   => (int) (Math.random() * count) + start 
		 */
		
		
		//int num = (int)(Math.random()*6) +1 가지고 오고싶은게 2개 뿐이다! (int)(Math.random()*2) +5
		int num = (int)(Math.random()*6) +1;
		
		if(num ==1) {
			System.out.println(("1번이 나왔습니다."));
		}else if(num ==2) {
			System.out.println(("2번이 나왔습니다."));
		}else if(num ==3) {
			System.out.println(("3번이 나왔습니다."));
		}else if(num ==4) {
			System.out.println(("4번이 나왔습니다."));
		}else if(num ==5) {
			System.out.println(("5번이 나왔습니다."));
		}else if(num ==6) {
			System.out.println(("6번이 나왔습니다."));
		}
		
		//switch문 변경 / else -if 문 반복적으로 추가하여 코드가 복잡해서 간결하게 사용할때 많이 사용한다 
		num = (int)(Math.random()*6)+1;
			
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
		
		//break문이 없는 case 
		int time =(int)(Math.random()*4)+8;
		System.out.println("[현재 시각:" + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}
		//char 타입의 switch문 은 종종 뺀다 왜? 대소문 때문에
		//쇼핑몰 : 우수회원 - A / 일반 회원 - B /손님 
		//4개의 if 문 switch 이 필요하다 왜? 사용자는 대문자 A 나 소문자 a 해도 같다라고 인식한다 그
		//한번에 case 쓰고 break 걸어도된다 
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다");
		}
		
		//String 타입의 switch문
		String position ="과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
		 System.out.println("500만원");
		 	break;
		 default:
			 System.out.println("300만원");
		}
	}
	
	

}
