package com.yedam.java.ch0801;

public class RemoteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new Television();   //바꿔 끼우면서 효율적이게 사용 가능하다 Tv, Audio등 
		
		//rc=new Audio();
		
		rc.turnnOn();
		rc.setVolume(11);
		rc.tuenOff();
		
		//다중 인터페이스 
		Serch search = new Television();
		
		search.serch("google.com");
		
		
		
		//쓰기, 읽기, 리스트 조회
		
		Television tv = new Television();
				
		tv.turnnOn();
		tv.setVolume(11);
		tv.tuenOff();
		/*
		 * public void temp(RemoteControl rc){
		 * }
		 * 
		 * public void temp(Television tv){
		 * }
		 * 
		 */
		
		//추상 클래스 vs 인터페이스 
		//추상 클래스(extends) -> 필드, 생성자, 메소드 
		// 인터페이스(implement) -> 상수, 추상 메소드 :기능적 사용할떄 
		
		
	}

}
