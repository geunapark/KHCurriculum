package main;

import test.Dog;

public class Main {

	public static void main(String[] args) {
		/*상속
		 * 부모한테서 멤버 받아오는 것
		 * 
		 * 자식클래스는 부모클래스의 멤버를 받아옴
		 * 
		 * public class Dog extends Animal
		 * 
		 * 
		 * 
		 * */
		System.out.println("===== 상속 =====");
		
		Dog a=new Dog();
		a.hair='L';
	}

}
