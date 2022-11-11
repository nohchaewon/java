package com.yedam.java.ch0703;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right",10);
		kumhoTire KTire = new kumhoTire("left",20);
		
		//Tire 객체에 자식 객체인 hTire
		//tire => 한국 타이어를 사용하고 있다
		Tire tire = hTire;
		System.out.println(tire.roll());
		
		tire = KTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
	}
}
