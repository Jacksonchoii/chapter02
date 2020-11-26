package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song s01 = new Song();
		
		s01.setAlbum("Real");
		s01.setArtist("아이유");
		s01.setComposer("이민수 작곡");
		s01.setTitle("좋은날");
		s01.setTrack(3);
		s01.setYear("2010");
		
		s01.showInfo();
		System.out.println(s01.toString());
		
		Song s02 = new Song("좋은날", "아이유", "Real", "이민수 작곡", "2010", 3);
		s02.showInfo();
		System.out.println(s02.toString());
		
		Song s03 = new Song("좋은날", "아이유");
		s03.setAlbum("Real");
		s03.setComposer("이민수 작곡");
		s03.setTrack(3);
		s03.setYear("2010");
		
		s03.showInfo();
		System.out.println(s03.toString());
		
		Song s04 = new Song("좋은날", 3);
		
		s04.setAlbum("Real");
		s04.setArtist("아이유");
		s04.setComposer("이민수 작곡");
		s04.setYear("2010");
		
		s04.showInfo();
		System.out.println(s04.toString());
		
		
	}
}
