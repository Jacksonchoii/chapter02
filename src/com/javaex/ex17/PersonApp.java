package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test -> 섞어쓰기
		//자료형 통일하기위해 , 학교 정보는 유지하고 싶음
		//Person s01 = new Student("유재석",44,"서울고등학교");
		
		//자식쪽 Student를 사용할 수 없다.
		//s01.getSchoolName();
		
		//s01.showInfo();  //자식쪽의 showInfo()가 실행된다. 덮어쓴다 오버라이딩
		//부모쪽의 showInfo()를 사용할 것이라고 생각되지만 사실은X
		
		//System.out.println(s01.toString()); //Student의 toString이 작동한다.
		
		Person[] psArray = new Person[5];
		
		Person p01 = new Person("둘리",1200);
		Person p02 = new Person("도우너",200);
		Person p03 = new Person("마이콜",300);
		
		Person s01 = new Student("유재석",44,"서울고등학교");
		Person s02 = new Student("강호동",47,"경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		
		System.out.println(((Student)psArray[3]).getSchoolName());
		
		
	}

}
