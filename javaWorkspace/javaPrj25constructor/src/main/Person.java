package main;

public class Person {
	
	//멤버 변수
	String  name;
	int age;
	
	//기본 생성자 == 매개변수 없는 생성자 == 자동으로 만들어짐(단, 아무 생성자도 없을 때)
	//개발자가 생성자를 안만들면 
	//jvm이 기본생성자를 자동으로 만들어줌
	
	
//	매개변수가 없는 생성자
	public Person() {
		System.out.println("생성자 호출됨 ~~~");
	}
	
	
	
//	매개변수 있는 생성자
	public Person(int x) {
		System.out.println("전달받은 정수 : "+x);
	}
	
	
	/*
	public Person() {
		System.out.println("생성자 호출됨 01 ~~~");
		this.name="가나다";
		this.age=1;
	} 
	
	public Person(String name) {
		System.out.println("생성자 호출됨 02 ~~~");
		this.name=name;
		this.age=1;
	}
	public Person(int age) {
		System.out.println("생성자 호출됨 03 ~~~");
		this.name="가나다";
		this.age=age;
	}
	public Person(String name, int age) {
		System.out.println("생성자 호출됨 04 ~~~");
		this.name=name;
		this.age=age;
	}
	
	*/
	
	//멤버 메소드
	public void hello() {
		System.out.println(name+"님 안녕ㅋㅋ");
	}

}
