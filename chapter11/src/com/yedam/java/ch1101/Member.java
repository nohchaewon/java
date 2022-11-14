package com.yedam.java.ch1101;

public class Member {
	
	public String id;
	public String id1;
	public String id2;

	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;//String 도 객체이다 
	
	public Member (String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//Objeck obj = new Member("blue"); 강제 타입 변환 member가 사용 할수 있도록  
	
		Member member = (Member) obj; //member class 안에 있는 필드 사용 
		//Member member = new Member("blue");
		
		if(id.equals(member.id)) { //Objeck id 를 불러오고 member 안에 있는 id를 불러서 같으면 동등 
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		//String a = "1";  10번지  a,b와 같은 객체 주소도 같다 
		//String b = "1";  10번지 
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5
				+ ", id6=" + id6 + ", id7=" + id7 + "]";
	}
	
	
}
