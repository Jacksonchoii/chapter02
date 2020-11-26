package com.javaex.ex05;

public class Point {

	private int x;
	private int y;
	
	
    //생성자	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}

	//Point(int) , Point(int) 자료형까지만 구분해서 겹치는 걸로 인식함
	/*
	public Point(int y) {
		this.y = y;
	}
	*/
	
	//메소드 getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("점 x = "+x+", 점 y = "+y+" 값이 찍혔습니다");
	}
	
}
