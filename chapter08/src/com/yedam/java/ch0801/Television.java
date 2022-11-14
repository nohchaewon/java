package com.yedam.java.ch0801;
 
public class Television implements RemoteControl, Serch{
	private int volume;
	
	@Override
	public void turnnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void tuenOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {   //0을 유지해준다 
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:"+this.volume);
	}

	public void setVlium(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serch(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}

		
	}


