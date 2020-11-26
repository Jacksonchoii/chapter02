package com.javaex.ex01;

public class Goods {

	private String name;
	private int price;
	
	
	public Goods() {
		//메모리가 올라간다
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: "+ name + ", 가격:" + price);
	}
}
