package bank;

import java.util.Scanner;

public class BankSystem {
	//final은 재할당 불가능
	//
	private final Scanner sc=new Scanner(System.in);
//	public BankSystem() {
//		this.sc=new Scanner(System.in);
//	}
	
	//잔액조회
	public void selectBalance(AccountInfo x) {
		System.out.println(x.getName()+"님의 잔액 : "+x.getBalance()+"원");
		
	}
	//입금하기
	public void plus(AccountInfo x) {
		if(x.getCnt()==5) {
			System.out.println("너님 5번 틀림");
			return;
		}
		System.out.print("입금하실 금액 : ");
		int value=scanNumber();
		x.setBalance(x.getBalance()+value);
		System.out.printf("입금 완료 ! %d원\n",value);
		
	}
	//출금하기
	public void minus(AccountInfo x) {
		if(x.getCnt()==5) {
			System.out.println("너님 5번 틀림");
			return;
		}
		
		selectBalance(x);
		System.out.print("출금하실 금액 : ");
		int value=scanNumber();
		
		//비번검증
		while(x.getCnt()<5) {
			boolean isOk =checkPwd(x);
			if(!isOk) {
				System.out.println("[출금 실패] 비밀번호 불일치");
				x.setCnt(x.getCnt()+1);
				
			}else {
				if(x.getBalance()<value) {
					System.err.println("[출금 실패] 잔액이 부족합니다.");
					return;
				}
				x.setCnt(0);
				x.setBalance(x.getBalance()-value);
				System.out.printf("출금완료 ! %d원\n",value);
				return;
			}
			
		}
		
		
	}
	//비번검증
	private boolean checkPwd(AccountInfo x) {
		System.out.print("비밀번호 : ");
		String userInputPwd=sc.nextLine();
		if(x.getPwd().equals(userInputPwd)) {
			return true;
		}
		return false;
	}
	
	//메뉴보여주기
	public int showMenu() {
		System.out.println("=====신한은행=====");
		System.out.println("0. 종료하기");
		System.out.println("1. 잔액 조회");
		System.out.println("2. 입금하기");
		System.out.println("3. 출금하기");
		System.out.print("번호 입력 : ");
		int userInputNumber=scanNumber();
		return userInputNumber;
	}
	//숫자 받기
	private int scanNumber() {
		String str=sc.nextLine();
		int num=Integer.parseInt(str);
		return num;
	}
	

}
