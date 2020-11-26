package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Goods camera = new Goods();
		
		
		camera.setName("니콘");
		String cameraName = camera.getName();
		System.out.println(cameraName);
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		*/
		
		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		
		Goods computer = new Goods("LG그램",1000000);
		computer.showInfo();
		
		Goods cup = new Goods("머그컵",2000);
		cup.showInfo();
		
		
		/*
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		String comName = computer.getName();
		System.out.println(comName);
		
		computer.setPrice(1000000);
		int comprice = computer.getPrice();
		System.out.println(comprice);
	
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		String cupName = cup.getName();
		System.out.println(cupName);
		
		cup.setPrice(2000);
		int cupPrice= cup.getPrice();
		System.out.println(cupPrice);
		
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		*/
		
	}

}
