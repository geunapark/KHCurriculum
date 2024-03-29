package main;

import java.util.Scanner;

public class PokemonGameManager {
	public void gameStart() {
		
		
		
		//포켓몬 선택 (유저, 상대)
		//아래 7줄은 포켓몬들 정보를 보여주는 코드임
		printPokemonInfo();
		//유저한테 숫자 입력받기
		
		
		
		Pokemon user;
		Pokemon com;
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		switch (str) {
		case "1": {
			user=new Pokemon("피카츄",100,30,10);
			com=new Pokemon("파이리",90,33,9);
			break;
		}
		case "2": {
			user=new Pokemon("파이리",90,33,9);
			com=new Pokemon("꼬부기",110,27,13);
			break;
		}
		case "3": {
			user=new Pokemon("꼬부기",110,27,13);
			com=new Pokemon("피카츄",100,30,10);
			break;
		}
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		//배틀 (한대씩 서로 때리기, 유저가 선빵)
		boolean isBattleOver=false;//true은 배틀 끝난거임 . false은 배틀 안끝난거임.
		while(!isBattleOver) {
			isBattleOver=handleAttack(user, com);
			isBattleOver=handleAttack(com, user);
			
			
		}
		
		
		
		
		
		
		
	}
	
	public boolean handleAttack(Pokemon attacker,Pokemon deffender) {
		if(attacker.hp<=0||deffender.hp<=0) {
			return true;
		}
		attacker.bodyAttack();
		int damage=attacker.apk-deffender.def;
		deffender.hp -= damage;
		System.out.println("데미지 : "+damage);
		System.out.println(deffender.name+"의 남은 체력 : "+deffender.hp);
		if(deffender.hp <= 0){
			return true;
		}
		return false;
	}
	public void printPokemonInfo() {
		System.out.println("-------------------------------");
		System.out.println("★★★★★★★★★★★★★★★★★★");
		System.out.println("1. 피카츄");
		System.out.println("2. 파이리");
		System.out.println("3. 꼬부기");
		System.out.println("★★★★★★★★★★★★★★★★★★");
		System.out.println("-------------------------------");
	}

}
