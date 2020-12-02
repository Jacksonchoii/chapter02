package com.javaex.ex20;

public abstract class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;

	
	//생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	
	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
	//메소드 일반
	//draw()는 만들 수 없음 -> 공통인 부분만 가지고 만들 수 없기 때문 도형을 그리기 위한 최소값 필요
	public abstract void draw();
	public abstract double area();
	
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
}
