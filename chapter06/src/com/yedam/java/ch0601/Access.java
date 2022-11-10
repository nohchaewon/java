package com.yedam.java.ch0601;

//여기서도 접근제한 걸수있다 
public class Access {
	//필드
	//public 누구나 어디서든 접근 가능하게 만들어주는 것(대상: 모든속성, 필드, 메소드,생성자 등등 전부) 
	//private 내가 속한 클래스 내부에서만 사용가능 
	//protected 상속받은 상태에서 부모-자식 간 사용가능 (패키지 달라도 사용가능)
				// 같은 패키지 내에서사용가능 
	//default 같은 패키지 내에서 사용가능, 패키지가 다르면 사용불가 
	
	
	//필드 에서 접근제한걸기
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	//생성자
	
	
	//메소드 에서 접근제한걸기 
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy();
	}
		
	private void privacy() {
		System.out.println("접근이 불가능합니다.");
	}
	
	
	
}	
