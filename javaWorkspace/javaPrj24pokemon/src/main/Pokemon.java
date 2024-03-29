package main;



public class Pokemon {
	//객체는 힙메모리 안에 만들어짐
	//jvm에 의해 널값 0 으로 채워진다.
	//jvm은 힙메모리에서 활동
	String name;
	int hp;
	int atk;
	
	public void bodyAttack() {
		System.out.println(name+"의 몸통 박치기 !!!");
	}
	
	
	
}
