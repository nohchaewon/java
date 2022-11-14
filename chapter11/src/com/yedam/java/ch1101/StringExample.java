package com.yedam.java.ch1101;

import java.io.UnsupportedEncodingException;

public class StringExample {

	//String에 대하여 
	
	//String a = "1"  100번지
 	//String c = "1"  100번지
	//String b = new String("1");  200번지 
	
	
	public static void main(String[] args) {
		//바이트 -> 문자열 
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		//배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//String str2 = new String(바이트 배열,시작점,갯수);
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		//String 메소드
		//1) charAt(int index) - 특징 문자 위치 반환 : 하나만 넣을수 있다
		
		String ssn = "123456-149456";
		char sex = ssn.charAt(7);
		
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		//문자열 비교 
		//equals() 사용 
		
		String strVar1 = new String("자바");
		String strVar2= "자바";
		String strVar3= "자바";
		
		//주소 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조"); 
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//값(데이터) 비교 
		if(strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
		
		//바이트 배열로 변환 (한글자씩 쪼개는것)  한글은 한개당 3byte이다 그래서 15바이트
		byte[] bytes2 = null;
		String str = "안녕하세요";
		bytes2 =str.getBytes();
		System.out.println(bytes2.length);
		
		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String" +str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length:" +bytes3.length);
			
			String str4 = new String(bytes3,"EUC-KR");
			System.out.println("bytes3 - > string" +str4);
			
			//변환할때 오류나면 넣어라 
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//문자열 찾기 
		String subject = "자바 프로그래밍";
		
		int index = subject.indexOf("프로그래밍");
		
		System.out.println(index);   //=> 3 공백도 포함이다 
		 
		index = subject.indexOf("a");
		System.out.println(index);
		
		//문자열이 문자 개수 얻기
		System.out.println(subject.length());
		
		//문자열 대체 
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		//Java 프로그래밍으로 봐낀게 아니고 데이터가 새로 메모리에 저장된것이다 "자바 프로그래밍"은 존재하고있다 
		System.out.println(newStr);
		
		//oldStr = "자바"; 100번지
		//oldStr = "프로그래밍"; 200번지
		//oldStr = "재밌다앙";	 300번지 
		
		//StringBuilder  또는 buffer : buffer 은 임시저장소 따로 소모하지않는다 
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append(false);
		
		sb.append("자바"); //500번지
		sb.append("프로그래밍"); //500번지
		sb.append(123);  //500번지
		
		System.out.println(sb);
		System.out.println(sb2);
		
		
		//대소문자 바꾸기
		String strVal = "abcdefgfkdsfdskjfsdlfj";
		String strVale2 = "FDSJKFDSKLFJEISD";
		
		System.out.println(strVal.toUpperCase());  //소문자 -> 대문지
 		System.out.println(strVale2.toLowerCase());  //대문자 -> 소문자 
		
		//trim
		String strTrim = "     자바    ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim()); //양쪽 공백 지우기 
		
		
		//substring()
		//substring(index, end)
		//index부터 end 까지 짜르세요
		//substring(index)
		//index부터 끝까지 자르세요 
		
		String ssn2 = "888015-454544";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split() 자르는거 
		String strSplit = "1-1-1-1-1-2-3-4-5-6-9-";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp : strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환 
		
		//숫자, 소수, 불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
	}
	
}
