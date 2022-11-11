package com.yedam.java.ch0701;

public class  Parent {

	//필드 
	public String firstName ="smith";
	public String lastName;
	private String job = "programmer";
	public char bloottype = 'o'; 
	public int  age;
	//생성자
	
	//메소드 
	//메소드
		@Override  //부모의 클래스를 재정비 하겠다라는 의미 
		public void method1() {
			System.out.println("paernt 클래스 method1호출");
		}
		public void method2() {
			System.out.println("paernt 클래스 method2호출");
		}
		
}
