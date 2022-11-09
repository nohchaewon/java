package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 번호를 예측하는 프로그램 
		//1~45까지 랜덤으로 -6개
		boolean run = true;
		Scanner sc= new Scanner(System.in);
		
		int[] numList = null; 
		int count = 0;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.새로고침| 2.번호예측 |3.번호삭제 |4.번호출력 |5.분석 |6.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 >");
			int selectNo =Integer.parseInt(sc.nextLine());

			
			if(selectNo ==1) {//로또번호 담을수 있는 배열이 초
				numList = new int[6];
				count=0;//list가 전에 내용이 있던말던 새로가져온다
			}else if(selectNo ==2) { //번호 예측 1~45중에 랜던한값 가져옴 
				if(count < numList.length) { 
				int num = (int)(Math.random()*46)+1;
				numList[count++] = num;//count가 몇개 되어있는지도 알수있다 하지만 무한정 나올수 있으니 if문 써야함
				System.out.println("현재 가져온 수의 갯수:"+ count);
				}else {
					System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			}else if(selectNo ==3) { //기존에 값 중 가장 최근 값 삭제 (하나만)
				//count = 6 -> index = count-1 /5이기에 -1 
				numList[--count] = 0; //-를 진행해야한다 
				System.out.println("현재 가져온 수의 갯수 :"+ count);
			}else if(selectNo ==4) { //배열의 값을 전부 출력 
				System.out.println("현재 가지고 있는 수의 갯수:"+count);
				for(int i=0; i< count; i++) {
					System.out.println(numList[i]+" ");
				}
				System.out.println(); 
			}else if(selectNo ==5) { //중복유무 와 중복된 값이 몇번 중복되었는지
				int[] list =new int[45];
				//개표 
				for(int i=0; i<count; i++) {
					int index = numList[i] -1;
					list[index]++;
				}
				//개표상황을 정리해서 보여줌 
				boolean isChecked = false; //boolean 은 for문 못돌린다
				for(int i=0; i<list.length; i++) {  //
					if(list[i] <=1) continue;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n",(i+1),list[i]);
				
					isChecked = true;
				}
				if(!isChecked) {  
					System.out.println("중복 값이 존재하지 않습니다.");
				}
				
			}else if(selectNo ==6) {
				run =false;				
			}else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("메뉴를 확인하고 다시 입력하세요.");
			}
		}
				
		
		
		
		
	}

}
