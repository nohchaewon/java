package com.yedam.java.ch0801;

public interface RemoteControl {

	//인터페이스 선언 할수 있는것 2가지 
	
	//1)상수
	//->public static final PI -3.14;
	
	
	//2)추상메소드
	//->public void mathod1();
	
	//기본 설계도 
	//대규모 프로젝트 => 번역 
	//A: 영어 -> 한글(메소드 : 번역)         똑같은 기능(번역)을 하는데 메소드 이름이 다른데 인터페이스를 활용하면  
	//B: 영어 -> 일본어 (메소드: method1())
	//C: 영어 -> 중국어 (메소드: method2())
	
	//프로젝트 완료 
	//똑같은 메소드 이름으로 구현 했다고 치면 유지보수 할떄 쉽다. 
	
	//public [static final(생략된것이다)] int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드 
	//public [abstact(생략된것)] void turnOn();
	public void turnnOn();
	public void tuenOff();
	public void setVolume(int volume);
	
}
