package com.yedam.java.ch0604;

public class Car {

	//필드
	int gas;
	//생성자
	
	
	
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() { //isLeftGas 는 boolean 타입 현재값이 남아있으면 true 없으면 false 
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;  //멈춰준다 
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.isLeftGas()) {  //내부에서 서로서로 호출 가능 
				System.out.println("달립니다.(gas 잔량:"+this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다.(gas 잔량:"+this.gas+")");
				return; //어느위치에있던 그순간 끝 
			}
		}
	}
}
