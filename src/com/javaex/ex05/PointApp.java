package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		p1.draw();
		
		Point p2 = new Point(9, 6);
		p2.draw();
		
		Point p3 = new Point(14);
		p3.setY(22);
		p3.draw();
		
		
		// Point(int y) 생성자 사용
		// setX() 사용
		// draw() 사용
		
	}

}
