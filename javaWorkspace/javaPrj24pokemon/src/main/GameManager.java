package main;

import java.util.Scanner;

public class GameManager {
	
	public void gameStart() {
		//포켓몬 객체 준비
		Pokemon pikachu=new Pokemon();		
		pikachu.name="피카츄";
		pikachu.hp=100;
		pikachu.atk=30;
		
		Pokemon turtle=new Pokemon();
		turtle.name="꼬부기";
		turtle.hp=110;
		turtle.atk=25;
		
		Pokemon pairi=new Pokemon();
		pairi.name="파이리";
		pairi.hp=90;
		pairi.atk=33;
		
		//유저 포켓몬, 상대 포켓몬 셋팅
		Pokemon user;
		Pokemon com;
		
		// new Scanner 객체를 만들고 그주소를 sc에 담아줌
		Scanner sc=new Scanner(System.in);
		
		System.out.println("원하시는 포켓몬 번호를 선택하세요");
		System.out.println("1.피카츄");
		System.out.println("2.꼬부기");
		System.out.println("3.파이리");
		
		int InputNum = Integer.parseInt(sc.nextLine());
		
		
		switch (InputNum) {
		case 1: {
			user=pikachu;
			com=turtle;
			break;
		}
		case 2: {
			user=turtle;
			com=pairi;
			break;
		}
		case 3: {
			user=pairi;
			com=pikachu;
			break;
		}
		default:
			System.out.println("잘못된 입력입니다. 프로그램 종료.");
			return;
		}
		
		
		
		
		//배틀S
		battle(user,com);
		

	}
	public void battle(Pokemon user,Pokemon com) {
		boolean isBattleOver=false;
		while(!isBattleOver) {
			isBattleOver = calcDamage(user,com);
			if(isBattleOver) {
				break;
			}
			isBattleOver = calcDamage(com,user);
		}
	}
	
	public boolean calcDamage(Pokemon attacker, Pokemon deffender) {
		attacker.bodyAttack();
		deffender.hp-=attacker.atk;
		System.out.println(attacker.name+"의 공격 성공 ! (데미지 : "+attacker.atk+")");
		System.out.println(deffender.name+"의 남은 체력 : "+deffender.hp);
		System.out.println("-----------------------------------");
		if(deffender.hp<=0) {
			return true;
		}
		return false;
	}
	
	
}
