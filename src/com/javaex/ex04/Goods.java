package com.javaex.ex04;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자 - 메모리에 올린다
	public Goods() {}
	
	public Goods (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		this.name = name;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반메소드
	
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
	
}
