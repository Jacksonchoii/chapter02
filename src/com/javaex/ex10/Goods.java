package com.javaex.ex10;

public class Goods {

	//필드
	private String name;
	private int price;
	//public static int totalCount;
	//위험하므로 잘 쓰지는 않는다
	
	//생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		//totalCount = totalCount +1;
	}

	public Goods() {
		//totalCount = totalCount +1;
	}

	public Goods(String name) {
		this.name = name;
		//totalCount = totalCount +1;
	}

	//메소드 getter setter
	
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
	
	//메소드 일반
	public void showInfo() { //복잡한로직
		System.out.println("상품명:"+name+", 가격:"+price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}


	
	
	
	
}
