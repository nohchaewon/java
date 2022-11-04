package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
		
		byte b = 100;
		//byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result3 :" + result3);
		
		//증감연산자
		int x=10;
		int y=10;
		int z=0;
		System.out.println("-------------------------");
		x++;   //결과 : 11
		++x;   //결과 : 12
		System.out.println("x=" +x);  // 결과 12
		
		System.out.println("-------------------------");
		y--;   
		--y;
		System.out.println("y=" + y);  //결과 8
		
		System.out.println("-------------------------");
		z = x++;    //x가 z에 먼너 들어간후(대입연선자 후 증가연산자)1씩 증가된다 
		System.out.println("z=" + z);  //결과: 12
		System.out.println("x=" + x); //결과: 13
		
		System.out.println("-------------------------");
		z = ++x;     //앞에 있는거는 먼저 더한후 들어간다 
		System.out.println("z=" + z);  //결과: 14  
		System.out.println("x=" + x); //결과:  14
		
		System.out.println("-------------------------");
		z = ++x + y++;   
		// 1) ++x => 15
		// 3) y++ =>9 <- 문제인 증감연상자가 뒤에서 붙어서 기다린다  원래는 3번쨰인데 순서 바꾼다 2번으로 
		// 2) x + y => 15 + 8 =>23
		// 4) = => z = (x+y) => z +23   대입연산자 -무조건 
		System.out.println("z=" + z);  //결과: 23
		System.out.println("x=" + x); //결과:  15
		System.out.println("y="+y);  //결과 : 9
		
		/***/
		x = 5;
		y =5;
		System.out.println("-------------------------");
		z = x++ + --y;   //대입은 + 먼저 처리 
		// 1)--y  =>4
		// 2)x + y  =>5+4 =>9   ** 답나오면 그게 결과고 x + 1은 그후 x 값이다 
		// 3) x++  => 6
		// 4)z = x + y  => z = 9
		System.out.println("z="+z);  //결과 :9
		System.out.println("x="+x);  //결과 : 6
		System.out.println("y="+y); //결과: 4
		
		System.out.println("-------------------------");
		z = --x + y++;
		// 1) --x  => 5
		// 2) x + y  => 5 + 4 =9  **
		// 3) y++ => 5
		// 4) z = x y => z = 9 
		System.out.println("z="+z);  //결과 :9
		System.out.println("x="+x);  //결과 :5
		System.out.println("y="+y); //결과: 5
		
		//논리 부정 연산자 
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {  //강제로 false 로 바꿀때 사용한다. 
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업중입니다.");
		}
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result:" +result);
		
		result = v1 - v2;
		System.out.println("result:" +result);
		
		result = v1 * v2;
		System.out.println("result:" +result);
		
		result = v1 / v2;
		System.out.println("result:" +result);
		
		result = v1 % v2;
		System.out.println("result:" +result);
		
		//비교연산자 
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2);
		System.out.println(">=:" +bResult);
		
		bResult = (num1 == num2);
		System.out.println("==:" +bResult);
		
		bResult = (num1 !=num2);
		System.out.println("!=:" +bResult);
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		System.out.println("문자 비교:"+ (char1> char2));
		
		
		int v3 =1;    
		double v4 = 1.0;
		System.out.println("int VS double:" + (v3==v4));  //true 정밀도가 달라서 
		
		float v5 =0.1F;
		double v6 = 0.1;
		System.out.println("float VS double :" + (v5 ==v6));     
		System.out.println("float Vs float:" + (v5 ==(float)v6));
		
		//논리 연산자
		
		int charCode = 'A';  //char 타입보다 int가 커서 
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자   논리 비교는 && <-얘를 자주쓴다 
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		
		//유티코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자 
		if((charCode >=97) & (charCode <= 122)) {
			System.out.println("소문자");
		}
		
		//유니코드 중에 48보다 크고 57보다 작으면 숫자 0~9 
		if((charCode >=48 ) && (charCode <=57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		if( (numValue % 2 == 0)|(numValue % 3 ==0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		if( (numValue % 2 == 0)||(numValue % 3 ==0)) {   // || 두개를 더 많이 쓴다 
			System.out.println("2 또는 3의 배수군요.");
		}
		//복합 대입 연산자 
		
		int resultA = 0;
		resultA += 10; // resultA = resultA +10  =>10 + 먼저한후 = 대입하라 
		System.out.println("+=:" +resultA);
		
		resultA -= 5; // resultA = resultA - 5 =>5
		System.out.println("-=:" +resultA);

		resultA *= 3;  //resultA = resultA *3  =>15
		System.out.println("*=:" +resultA);

		resultA /= 5;  //resultA = resultA / => 3
		System.out.println("/=:" +resultA);

		resultA %=3;  //resultA = resultA %3  => 0
		System.out.println("%=:" +resultA);

		//삼항 연산자 
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B' ;
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n",score,grade);
		
		int age = 17;
		String message = (age >= 20)? "성인입니당.": "미성년자야";
		System.out.printf("나이는 %d살이며 %s입니다.\n",age,message);
		
		
	}
	

}
