package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		
		p1.setNum(5);
		int p1x = p1.getNum();
		System.out.println(p1x);
		
		p1.setNum2(2);
		int p1y= p1.getNum2();
		System.out.println(p1y);
		
		p1.draw();
		
		Point p2 = new Point();
		
		p2.setNum(10);
		int p2x = p2.getNum();
		System.out.println(p2x);
		
		p2.setNum2(23);
		int p2y = p2.getNum2();
		System.out.println(p2y);
		
		p2.draw();
		
		Point p3 = new Point();
		
		p3.setNum(7);
		int p3x = p3.getNum();
		System.out.println(p3x);
		
		p3.setNum2(13);
		int p3y = p3.getNum2();
		System.out.println(p3y);
		
		p3.draw();
		
		Point p4 = new Point();
		
		p4.setNum(12);
		int p4x = p4.getNum();
		System.out.println(p4x);
		
		p4.setNum2(8);
		int p4y = p4.getNum2();
		System.out.println(p4y);
		
		p4.draw();
		
		
	}

}
