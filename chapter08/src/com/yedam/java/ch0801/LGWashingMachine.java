package com.yedam.java.ch0801;

public class LGWashingMachine implements WashingMaching {

	@Override
	public void starBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기가 빨래 시작");
	}

	@Override
	public void pauseBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기 빨래를 일시 중지");
	}

	@Override
	public void stopBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기 빨래를 중지");
	}

	@Override
	public int changeSpeed(int speed) {
		// TODO Auto-generated method stub
		switch(speed){
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;
	}

}
