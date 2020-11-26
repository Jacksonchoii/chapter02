package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods();
		
		//System.out.println(Goods.totalCount);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		System.out.println(camera.toString());
		
		
		Goods computer = new Goods("LG그램",1000000);
		
		//System.out.println(Goods.totalCount);
		computer.showInfo();
		System.out.println(computer.toString());
		
		
		
		Goods cup = new Goods("머그컵");
		
		//System.out.println(Goods.totalCount);
		cup.setPrice(2000);
		cup.showInfo();
		System.out.println(cup.toString());
		
		
		
	}

}
