package com.yedam.java.ch0601;

import java.util.Scanner;
//import 강제등록 
import com.yedam.java.ch0604.Computer;
public class Application {

	//필드 
	int staticTest = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application ap = new Application();
		
		ap.staticTest = 2;
		
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlopper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.words);
			
		System.out.println(ConstantNo.EARTH_Round);
		
		//메모리 -heap영역에 저장함
		Access access =new Access();
		
		//1)public
		access.free ="public";
		access.free();
		//2)privacy
		//access.privacy ="privacy";
		//access.privacy();  //privacy걸어두어서 오류난다
		//3)protected
		access.parent ="parent";
		//4)default
		access.basic ="basic";
		
		
		
		Singleton s1 = Singleton.getInstance();
					//singleton == new Singleton(); 
		Singleton s2 = Singleton.getInstance();  
		//Singleton s1 == new Singleton() 같다!! 
		
		System.out.println(s1);  //s2 와 주소가 같다 
		System.out.println(s2);
		
		//3개다 의미가 같으므로 모두 같다
		//singleton ==new Singleton()
		//getInstance() ==  new Singleton()
		//getInstance() ==singleton === new Singleton() ★
		
		Member mem = new Member();
		
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter, getter 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-123-4567");
		mem.setAge(22);
		
		
		System.out.println("ID:"+mem.setId());
		System.out.println("Tel:"+mem.());
		System.out.println("Age:"+mem.gatAge());
	
	}

}
