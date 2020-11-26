package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Song IU = new Song();

		/*
		IU.setAlbum("Real");
		String IUalbum = IU.getAlbum();
		System.out.println(IUalbum);

		IU.setArtist("아이유");
		String IUartist = IU.getArtist();
		System.out.println(IUartist);

		IU.setComposer("이민수 작곡");
		String IUcomposer = IU.getComposer();
		System.out.println(IUcomposer);

		IU.setTitle("좋은날");
		String IUtitle = IU.getTitle();
		System.out.println(IUtitle);

		IU.setTrack("3번 track");
		String IUtrack = IU.getTrack();
		System.out.println(IUtrack);

		IU.setYear(2010);
		int IUyear = IU.getYear();
		System.out.println(IUyear);
        */
		
		
		/*
		IU.setAlbum("Real");
		IU.setArtist("아이유");
		IU.setComposer("이민수 작곡");
		IU.setTitle("좋은날");
		IU.setTrack("3번 track");
		IU.setYear(2012);
		*/
		
		Song IU = new Song("Real", "아이유", "이민수 작곡", "좋은날", "3번 Track", 2012);
		
		IU.showInfo();

		Song BB = new Song();

		BB.setAlbum("Always");
		String BBalbum = BB.getAlbum();
		System.out.println(BBalbum);

		BB.setArtist("BIGBANG");
		String BBartist = BB.getArtist();
		System.out.println(BBartist);

		BB.setComposer("G-DRAGON 작곡");
		String BBcomposer = BB.getComposer();
		System.out.println(BBcomposer);

		BB.setTitle("거짓말");
		String BBtitle = BB.getTitle();
		System.out.println(BBtitle);

		BB.setTrack("2번 track");
		String BBtrack = BB.getTrack();
		System.out.println(BBtrack);

		BB.setYear(2007);
		int BByear = BB.getYear();
		System.out.println(BByear);

		BB.showInfo();

		Song Busker = new Song();

		Busker.setAlbum("버스커버스커1집");
		String Buskeralbum = Busker.getAlbum();
		System.out.println(Buskeralbum);

		Busker.setArtist("버스커버스커");
		String Buskerartist = Busker.getArtist();
		System.out.println(Buskerartist);

		Busker.setComposer("장범준 작곡");
		String Buskercomposer = Busker.getComposer();
		System.out.println(Buskercomposer);

		Busker.setTitle("벚꽃엔딩");
		String Buskertitle = Busker.getTitle();
		System.out.println(Buskertitle);

		Busker.setTrack("4번 track");
		String Buskertrack = Busker.getTrack();
		System.out.println(Buskertrack);

		Busker.setYear(2012);
		int Buskeryear = Busker.getYear();
		System.out.println(Buskeryear);

		Busker.showInfo();

	}

}
