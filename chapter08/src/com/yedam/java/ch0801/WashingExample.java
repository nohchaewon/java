package com.yedam.java.ch0801;

public class WashingExample {
public static void main(String[] args) {
	
	washing(new LGWashingMachine());
	//washing(new SanmsungWashingMachine()); 이렇게 객체만 바꿔서 사용하면 삼성세탁기가 조회된다. 
	}

	 public static void washing(WashingMaching wm) {
		 wm.starBtn();
		 System.out.println("세탁기 속도는"+ wm.changeSpeed(3));
		 wm.stopBtn();
	 }
}

