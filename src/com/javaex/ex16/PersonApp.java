package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Person 배열 관리
		Person[] pArray = new Person[3];
		
		Person p01 = new Person("둘리",1203);
		//System.out.println(p01.toString());
		
		Person p02 = new Person("도우너",200);
		Person p03 = new Person("마이콜",300);
		
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		//p01.showInfo();
		//100명 관리중
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		/////////////////////////////////////////
	
		Student[] sArray = new Student[2];
		
		Student s01 = new Student("유재석",44,"서울고등학교");
		//System.out.println(s01.toString());
		
		Student s02 = new Student("강호동",47,"경기고등학교");
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].showInfo();
		}
		
		//s01.showInfo(); 자식
		//s01.showInfo();  부모
		
		//showInfo 메소드의 이름이 부모,자식이 같으면 
		//자기자신(자식)의 메소드만 나온다
		
		//케스팅 테스트
		Person t01 = sArray[4];
		// Student t02 = psArray[4];   //오류 양쪽의 자료형이 다름
		Student t03 = (Student)sArray[4];
		Person t04 = (Student)sArray[4]; //자동으로 업케스팅 된다. 눈에 안보이지만 (Person)(Student)psArray[4];이 된 것임
		
		
	}

}
