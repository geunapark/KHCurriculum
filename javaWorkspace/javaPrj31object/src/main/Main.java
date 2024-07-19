package main;

import test.Person;
import test.phone;
import test.Food;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 객체 ======");

		// 객체 만들기 == 생성자 호출하기
		Food f = new Food();
		// 객체 멤버(변수) 접근 (값 넣기)
		f.name = "김밥";
		f.price = 1500;
		f.cnt = 2;
		f.isSoldout = true;

		// 객체 멤버(변수) 접근 (값 꺼내기)
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(f.cnt);
		System.out.println(f.isSoldout);
		// 객체의 메소드 호출하기

	}// main

}// class
