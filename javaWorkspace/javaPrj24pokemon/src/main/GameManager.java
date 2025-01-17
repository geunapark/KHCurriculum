package main;

import java.util.Scanner;

public class GameManager {

	public void gameStart() {
		// 포켓몬 객체들 준비
		pokemon pikachu = new pokemon();

		pikachu.name = "피카츄";
		pikachu.hp = 100;
		pikachu.atk = 30;

		pokemon turtle = new pokemon();
		turtle.name = "꼬부기";
		turtle.hp = 110;
		turtle.atk = 25;

		pokemon pairi = new pokemon();
		pairi.name = "파이리";
		pairi.hp = 90;
		pairi.atk = 33;

		// 유저 포켓몬, 상대 포켓몬 셋팅
		pokemon user;
		pokemon com;

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 포켓몬 번호를 선택하세요.");
		System.out.println("1 . 피카츄");
		System.out.println("2 . 파이리");
		System.out.println("3 . 꼬부기");
		// Integer.parseInt( sc.nextLine()); //java String to int -> String을 int로 바꿔주는 것

		int inputNum = Integer.parseInt(sc.nextLine());

		switch (inputNum) {
		case 1:
			user = pikachu;
			com = pairi;
			break;
		case 2:
			user = pairi;
			com = turtle;
			break;
		case 3:
			user = turtle;
			com = pikachu;
			break;
		default:
			System.out.println("잘못된 입력입니다. 프로그램 종료.");
			return;
		}

		battle(user, com);

	}

	public void battle(pokemon user, pokemon com) {
		// 배틀
		boolean isBattleOver = false;
		while (!isBattleOver) {
			isBattleOver = calcDamage(user, com);
			if(isBattleOver) {
				break;
			}
			isBattleOver = calcDamage(com, user);
		}
	}// battle

	public boolean calcDamage(pokemon attacker, pokemon deffender) {
		attacker.bodyAttack();
		deffender.hp -= attacker.atk;
		System.out.println(attacker.name + "의 공격 성공! (데미지 : " + attacker.atk + ")");
		System.out.println(deffender.name + "의 남은 체력 : " + deffender.hp);
		System.out.println("-----------------------------------------");
		if (deffender.hp <= 0) {
			return true;
		}
		return false;
	}// calcDamage

}// class
