package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//테스트
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01.toString());
		
		Rectangle r = new Rectangle("노랑", "노랑", 100, 100);
		System.out.println(r.toString());
		r.draw();
		
		Circle c = new Circle("빨강", "파랑", 20);
		System.out.println(c.toString());
		c.draw();
		*/
		
		//Shape 배열만들기
		Shape[] sArray = new Shape[2];
		
		//사각형 만들기
		//Rectangle r01 = new Rectangle("빨강", "빨강", 5, 5); 이렇게 쓰면 안된다
		Shape r01 = new Rectangle("빨강", "발강", 100, 100);
		
		//원 만들기
		//Circle c01 = new Circle("빨강", "빨강", 5); 안된다 시야가 shape만 보여야하기 때문에
		Shape c01 = new Circle("초록", "초록", 500);
		
		//배열에 주소값 대입
		sArray[0] = r01;
		sArray[1] = c01;
		
		//전부 그리기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		//문제발생 -> 추상 클래스 추정
		//Shape s = new Shape("빨강", "검정");
		//s.draw();
		
		//전부 면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		
	}

}
