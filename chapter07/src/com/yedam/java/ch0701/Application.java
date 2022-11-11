package com.yedam.java.ch0701;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chid child = new Chid();
		
		//자식 클래스 고유 필드 
		child.lastName = "paul";
		child.age = 20;
		
		//부모 클래스 필드 
		System.out.println(child.firstName +child.lastName);
		
		//주의점
		//부모 -> 여려명자식  => 가능
		//자식 -> 여려명 부모(?) => 불가능 
		
		DmbCellphone dmb = new DmbCellphone("고아라폰", "화이트",10);
		
		//부코 클래스 필드 사용
		System.out.println("모델:"+dmb.model);
		System.out.println("색상:"+dmb.color);
		//자식 클래스 필드 사용 
		System.out.println("채널:"+dmb.channel);
		
		//부모 클래스 메소드 사용 
		dmb.poewrOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 김또치입니다.");
		dmb.powerOff();
		
		//자식 클래스  메소드 사용 
		dmb.turnOnDmb();
		
		Member member = new Member("고길동", "123123-456456",1);
		//부모 객체의  필드 사용
		System.out.println("name:"+member.name);
		System.out.println("ssn:"+member.ssn);
		//자식 객체의 필드 사용 
		System.out.println("memberNo:"+member.stdNo);
		
		
		
//		Chid cd = new Chid();
//		
//		cd.method1();
//		cd.method2();
//		cd.method3();
		
		
		Compute com = new Compute();
		
		double result = com.areaCircle(10);
		System.out.println("result:"+result);

		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
	
		sa.fly();
		
		sa.land();
	
	
		Chid chd = new Chid();
		//parent parent = new Child();
		//자동타입변환:
		//부모 클래스에 있는 필드, 메소드를 사용 하되 만약 자식 클래스에 오버라이딩이 되었는
		//메소드가 존재한다면 부모클래스가 정의된 메소드를 사용하지 않고 자식클래식에 있는 메소드 
		Parent parent = chd;
		
		parent.method1();
		parent.method2();
		
		
	
	
	
	
	
	}

}
