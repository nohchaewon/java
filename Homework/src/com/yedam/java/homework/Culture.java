package com.yedam.java.homework;

public class Culture {
	//필드
		public String name;
		public int director;
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getDirector() {
			return director;
		}


		public void setDirector(int director) {
			this.director = director;
		}


		public int getActor() {
			return actor;
		}


		public void setActor(int actor) {
			this.actor = actor;
		}


		public int getGwangaeg() {
			return gwangaeg;
		}


		public void setGwangaeg(int gwangaeg) {
			this.gwangaeg = gwangaeg;
		}


		public int getTotal() {
			return total;
		}


		public void setTotal(int total) {
			this.total = total;
		}


		public int actor;
		public int gwangaeg;
		public int total;
		
		
		Culture(String name, int director, int actor, int gwangaeg, int total){
			this.name=name;
			this.director = director;
			this.actor=actor;
			this.gwangaeg=gwangaeg;
			this.total=total;
			
			//메소드
			
			 public void setTotalScore(int score) {
				 System.out.println("관색수 와 총점 누적:"+(int)(gwangaeg+total));
			 }
			 public String getGrade() {
				 System.out.println("평점:");
			 }
			 public abstract void getInformation() {
				 System.out.println("영화제목:"+name);
				 System.out.println("감독:"+director);
				 System.out.println("배우:"+actor);
				 System.out.println("영화총점:"+gwangaeg);
			 }
		}
		
}
