package main;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import phone.Galaxy;
import phone.Iphone;

public class Main {
	public static void main(String[] args) {
		System.out.println("===== extends =====");
		
		//상속 : 부모클래스의 멤버를 자식 클래스에 전달함
		//메소드 덮어쓰기 == 메소드 재정의
		//@Override
		
		//<Object> : 모든 클래스는 Object의 자식이다.
		//모든 클래스는 Object 클래스의 자식이다.
		
		//자바에서 정해놓음.
		//부모 클래스 없으면 extends Object 자동으로 붙음
		
		//다형성 : 객체 하나가 다양한 형태를 취할 수 있음
		//polymorphism == 다형성 : 객체를 다양한 형태(타입)로 볼 수 있다.
		
		
		
		//추상화 abstract
		//추상클래스 : 객체 생성 불가능
//		public abstract class Animal {내용~~}
//		new Animal(); 객체생성불가
		//추상메소드 : 메소드 바디가 없는 메소드
//		public abstract void cry();//추상메소드
		//왜씀? 메소드 오버라이딩 무조건 하게 하려고
	
		//접근제한자 protected
		//public : 전체
		//protected : 상속
		//default : 패키지
		//private : 나만보기+-
		
		//super : 부모 객체 가리킴
		Dog dog=new Dog();
		dog.introduce();
		//생성자 : 생성자는 부모생성자 호출을 포함한다.
		
	
		
		
		
//		Dog dog=new Dog();
//		Cat cat=new Cat();
//		
//		dog.name="몬드";
//		dog.age=3;
//		System.out.println(dog.name);
//		System.out.println(dog.age);
//		dog.cry();
//		
//		cat.name="곤냥이";
//		cat.age=11;
//		System.out.println(cat.name);
//		System.out.println(cat.age);
//		cat.cry();
	}

}
