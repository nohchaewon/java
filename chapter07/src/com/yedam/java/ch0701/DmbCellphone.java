package com.yedam.java.ch0701;

public class DmbCellphone extends Cellphone {

	//필드
	public int channel;
	//생성자 
	public DmbCellphone(String model, String color, int channel ) {
		//부모 클래스 필드
		this.model =model;
		this.color =color;
		//자식 클랙스 필드
		this.channel = channel;
	}
	
	//메소드 
	void turnOnDmb() {
		System.out.println("채널:" +channel +"번 DMB 방송 수신을 시작합니다.");
	}
}
