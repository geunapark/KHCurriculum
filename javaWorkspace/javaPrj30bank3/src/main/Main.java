package main;

import bank.AccountInfo;
import bank.BankSystem;

public class Main {

	public static void main(String[] args) {
		BankSystem bs=new BankSystem();
		AccountInfo x=new AccountInfo("홍길동","111222333456","1234",0,1000000);
		
		//메뉴 보여주기
		
		
		while(true) {
			int num=bs.showMenu();
			
			switch (num) {
			case 0: {
				System.out.println("종료하기");
				return;
		
			}
			case 1: {
				bs.selectBalance(x);
				break;
			}
			case 2: {
				bs.plus(x);
				break;
			}
			case 3: {
				bs.minus(x);
				break;
			}
			default:
				System.out.println("잘못입력하셨음 ㅡㅡ;; 프로그램종료함");
				return;
			}
		}
		
		
		
		
	}

}
