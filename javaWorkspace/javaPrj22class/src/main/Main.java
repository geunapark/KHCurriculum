package main;

import pi.*;

public class Main {

	public static void main(String[] args) {
		fdsa f=new fdsa();
		f.hi();
		
		
		/*
		 * class vs 객체
		 * class 자동차 설계도,	붕어빵 틀,		설계도
		 * 객체 자동차,			붕어빵,	객체	
		 * class 사람
		 * 객체 홍길동,이순신 등등..
		 * 
		 * 
		 * */
		//한개의 클래스로 3개의 객체를 만듬!
//		Student x = new Student();
//		Student y= new Student();
//		Student z = new Student();
		
		//피캬츄 준비
		Pokemon p1=new Pokemon();
		p1.name="피카튜";
		p1.hp=100;
		p1.atk=30;
		p1.print();
		
		System.out.println();
		
		//파이리 준비
		Pokemon p2=new Pokemon();
		p2.test("파이리", 90, 33);
		p2.print();
		System.out.println();
		
		//배틀
		while(p1.hp>0&&p2.hp>0) {
			p1.bodyAttack();
			p2.hp -= p1.atk;
			System.out.println(p1.name+"가 "+p2.name+"를 공격했다.");
			System.out.println( p2.name+" 남은 체력 : "+p2.hp);
			System.out.println();
			if(p2.hp<=0) {
				break;
			}
			
			p2.bodyAttack();
			p1.hp -=p2.atk;
			System.out.println(p2.name+"가 "+p1.name+"를 공격했다.");
			System.out.println(p1.name+" 남은 체력 : "+p1.hp);
			System.out.println();
			
			
			
		}
		
		
		System.out.println("현재 포켓몬 상태");
		p1.print();
		p2.print();
		
		
	}

}
