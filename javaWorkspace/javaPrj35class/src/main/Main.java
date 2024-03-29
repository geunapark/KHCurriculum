package main;

import test.AccountInfo;
import test.Animal;
import test.Person;
import test.Pokemon;
import test.Tv;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== 클래스 작성 연습 =====");
		Person p= new Person();
		p.setName("홍길동");
		p.setAge(20);
		System.out.println(p);
		Pokemon m=new Pokemon();
		m.setName("피카츄");
		m.setHp(100);
		m.setAtk(30);
		System.out.println(m);
		Tv t=new Tv();
		t.setChannel(100);
		t.setVolume(10);
		System.out.println(t);
		AccountInfo a=new AccountInfo();
		a.setBalance("123123");
		a.setName("!!");
		System.out.println(a);
		Animal am=new Animal();
		am.setName("토끼");
		am.setAge(3);
		am.cry();
		am.cry();
		System.out.println(am);
		
	}

}
