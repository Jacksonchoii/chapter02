package com.javaex.ex20;

public class Rectangle extends Shape{

	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
		super();
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드 일반
	public void draw() {
		System.out.println("사각형-면색:" + super.fillColor + " 선색:" + super.lineColor + " 가로:" + width + " 세로:" + height);
	}
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
	
	
}
