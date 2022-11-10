package com.yedam.java.ch0601;

public class Bank {

	//은행 고객 정보 관리하는 클래스 
	//1) main :class 실행하는곳 2) Customer 3) Bank 
	//1) main ->생성자를 통한 고객의 정보를 저장, 출력
	//2) Bank ->해당은행의 금리를 저장
			//(현재 잔액 + (현재잔액 * 금리))
	//3) Customer -> 고객의 정보를 저장 
		//이름, 은행, 계좌 , 잔액의 대한 필드 
		// getInfo() : 입력한 정보 출력        
		//whithDraw() : 출금할때 정보를 출력 

	//필드 
	String name;
	String bank;
	int account;
	int money;
	
	//생성자
//	public Bank(String name, String bank, int account, int money) {
//		this.name = name;
//		this.bank = bank;
//		this.account = account;
//		this.money = money;
//	}
	//메소드
	public void getInfo() {
		System.out.println("=== 입력 하신 회원 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bank);
		System.out.println("계좌 : " + account);
		System.out.println("잔액 : " + money);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : " + money);
		System.out.println("금리 : %");
		System.out.println("예상 금액 : " + ((money)+(money*0.3)) + "원 입니다.");
	}
}

