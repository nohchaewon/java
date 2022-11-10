package com.yedam.java.ch0601;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone iphone14pro = new SmartPhone();  //참조타입:주소값으로 저장된곳을 넣어주는곳
								//할당해서 만드는게 :new  
		//정보를 넣을것이다
		iphone14pro.maker ="Apple";
		iphone14pro.name ="iphone14pro";
		iphone14pro.price =1000000;
		
		
		//정보 잘 들어 갔는지 확인할때 
		System.out.println("나의 핸드폰은"+iphone14pro.name+"입니다");
		System.out.println("나의 핸드폰 기종은"+iphone14pro.name+"입니다");
		
		iphone14pro.call();
		iphone14pro.hangUp();
		
		
		SmartPhone zflip4 = new SmartPhone();  
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name);  //null이라고 뜬다 
		
		zflip4.name = "zflip4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangUp();
		
		System.out.println(iphone14pro);    //재생하면 ->com.yedam.java.ch0601.SmartPhone@5aaa6d82 
		System.out.println(zflip4);				//class만든곳 각각 주소 표기된다 :이것이 참조타입!!!
											//String 객체,class객체 : 참조타입
		
		}

}
