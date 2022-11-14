package com.yedam.java.ch1101;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap -> Key, Value 데이터를 저장 
		//
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//new Key(1) -> 1
		hashmap.put(new Key(1),"홍길동"); //아래와(Key) 다른객체이므로 홍길동이 안나온다 
					//열쇠       데이터
		
		//new Key(1) - >2   니깐 위와 다른 객체이다 : 생긴것만 같고 주소는 다르다 
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
		Key key = new Key(1);
		
		System.out.println(key.toString());
	
		
	}

	}
		

	

