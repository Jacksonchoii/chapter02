package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Goods 관리를 위한 배열
		//따라가보면 굿스아파트 내가정한이름 메모리올리기 굿스
		Goods[] goodsArray = new Goods[3];
		
		Goods camera = new Goods("니콘",400000);
		Goods computer = new Goods("LG그램",1000000);
		Goods cup = new Goods("머그컵",2000);
		
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		
		for(int i=0; i<goodsArray.length; i++) {
			/*
			System.out.println(goodsArray[i].getName());
			System.out.println(goodsArray[i].getPrice());
		    */
			
			goodsArray[i].showInfo();
			//System.out.println(goodsArray[i].toString());
			
		}
		
		
		
	}

}
