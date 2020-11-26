package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	public void setNum(int num) {
		this.x = num;
	}
	
	public int getNum() {
		return x;
	}
	
	public void setNum2(int num) {
		this.y = num;
	}
	
	public int getNum2() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]를 그렸습니다.");
	}
	
}
