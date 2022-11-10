package com.yedam.java.ch0601;

public class Student {
	
	//필드
	// 학생이름, 학번, 학년 ,국어 영어 수학 성적 
	String name;
	//학번
	int school;
	//학년
	int number;
	//국어
	int kor;
	//영어
	int eng;
	//수학
	int mat;
	
	//생성자
	//생성자를 통해서 모든 데이터를 입력 
	public Student(String name, int school, int number, int kor, int eng, int mat) {
		this.name =name;   //앞에 있는 name은 필드에 있는 name  뒤에 있는것은 생성자에 적은 name 해당
		this.school = school;  
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.mat =mat;
	
	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.println("학생이름:"+name);
	}
	
	}
}
