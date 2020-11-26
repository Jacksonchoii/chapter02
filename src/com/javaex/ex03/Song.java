package com.javaex.ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	
	
	
	
	//생성자
	//메소드 유사하다 이름은 클래스명, 리턴형이 없다.
	
	public Song() {
		//메모리에 올린다
	}
	
	public Song(String album, String artist, String composer, String title, String track, int year) {
		//메모리에 올린다
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	//title
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	//artist
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	//album
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	//composer
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	//year
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	//track
	
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getTrack() {
		return track;
	}
	
	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+", "+composer+" )");
	}
	
	
	
}
