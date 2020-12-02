package com.javaex.ex20;

public class Circle extends Shape{

	//필드
	private int radius;

	//생성자
	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}

	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드ㅡ 일반
	public void draw() {
		System.out.println("원-면색:" + super.fillColor + " 선색:" + super.lineColor + " 반지름:" + radius);
	}
	
	public double area() {
		double area = radius * radius * 3.14;
		return area;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
}
