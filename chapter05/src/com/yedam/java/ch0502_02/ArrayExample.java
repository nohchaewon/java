package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3]; //int[]의 배열
					//크기가 두개다		//크기:내가가지고 있는거 2개 앞에 값은 뒤에   
		//1) 변수를 사용한것 
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScore["+i+"]");
			int[] mathScore = mathScores[i];
			
			for(int j=0; j<mathScore.length; j++) {
				System.out.print("\t mathScore[" +j+ "] :");
				System.out.println(mathScore[j]);
			}
		}
		System.out.println("--------------------------------------");
		//2) 변수 사용 안하는것 
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScore["+i+"]");
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.print("\t mathScores["+i+"][" +j+ "] :");
				System.out.println(mathScores[i][j]);
			}
		}
		
		int[][] scoreList = { 			
										{ 86, 65 }, 
										{ 58, 95, 73 } 
		
								};
		for(int i=0; i<scoreList.length;i++) {
			System.out.println(i +"번쨰 학생 성적=====");
			for(int j=0; j< scoreList[i].length; j++) {  //i대신 0을 넣으면 가능은 하나 위에 있는 숫자수에 밑에께  짤린다
				System.out.println(scoreList[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============================");
		int[][]englishScore = new int [2][];  
		englishScore[0] = new int [3]; //첫번쨰 서랍을 3칸으로 나눈다
		englishScore[1] = new int [2]; //두번쨰 서랍을 2칸으로 나눈다 
		
		for(int i=0; i<englishScore.length;i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.print("englishScore["+i+"]:");
				System.out.println(englishScore[i][j]);	
			}
		}
		//String 배열 
		System.out.println("===============================");
		String[] strArray = new String[3];
		strArray[0]= "java";
		strArray[1]= "java";
		strArray[2]= new String("java");
		
		//동등비교 연산자 
		System.out.println(strArray[0]== strArray[1]);   //같은 객체를 참
		System.out.println(strArray[1]== strArray[2]);  //다른 객체 
		System.out.println(strArray[1].equals(strArray[2]));  //문자열 을 비교하는 
		
		System.out.println();
		
		//for문으로 배열 복사하는 방법    첫번쨰부터 복사하는거는 i=0으로 하지만 중간에 넣는것은 다른걸로 한다 
		int[] oldIntAry = {1,2,3};     
		int[] newIntAry = new int[5];
		for(int i=0; i< oldIntAry.length; i++) {   //큰것보다 작은걸 넣어서 사용한다
			newIntAry[i] = oldIntAry[i];
		}
		
		for(int i=0; i< newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		System.out.println("===============================");
		//System.arraycopy()
		String[] oldStrAry= {"java","array","copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2,oldStrAry.length);
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		//향상된 for문 
		System.out.println("===============================");
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		//int index -1;  인덱스 사용시 하는데 for문을 굳이 사용? 
		for(int score :scores) {  //scores 는 score(임시변수)인곳에 담긴다 	
			sum += score;
			//System.out.println("인덱스:" + ++index);
		}
		System.out.println("점수 총합:" +sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합:" + avg);
		
	}
}

