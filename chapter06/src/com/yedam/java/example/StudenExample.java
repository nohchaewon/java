package com.yedam.java.example;

import java.util.Scanner;

import com.yedam.java.ch0601.Bank;

public class StudenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수>");
		int count = Integer.parseInt(sc.nextLine());

		Student[] std = new Student[count];

		for (int i = 0; i < std.length; i++) {

			Student student = new Student();

			System.out.println("학번 >");
			int sNo = Integer.parseInt(sc.nextLine());
			student.setsNo(sNo);

			System.out.println("국어점수>");

			int kor = Integer.parseInt(sc.nextLine());
			student.setKor(kor);

			System.out.println("수학점수>");
			int math = Integer.parseInt(sc.nextLine());
			student.setMath(math);

			System.out.println("영어점수>");
			int eng = Integer.parseInt(sc.nextLine());
			student.setEng(eng);

			std[i] = student;
		}

		for (int i = 0; i < std.length; i++) {
			std[i].getInfo();
		}
	}
}