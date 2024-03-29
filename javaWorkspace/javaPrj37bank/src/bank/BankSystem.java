package bank;

import util.Input;

public class BankSystem {
	
	public static final AccountInfo[] accountInfoArray=new AccountInfo[100];
	private static int cnt=0;
	//메뉴
	public boolean showMenu() {
		System.out.println("----- 은행 -----");
		System.out.println("0. 종료");
		System.out.println("1. 신규 개설");
		System.out.println("2. 목록 조회");
		System.out.println("3. 상세 조회");
		
		System.out.print("메뉴 번호 입력 : ");
		int num = Input.scanInt();
		
		switch (num) {
		case 0: {
			System.out.println("0번을 입력하셨습니다. 프로그램 종료합니다.");
			return true;
		}
		case 1: {
			createAccount();
			break;
		}
		case 2: {
			showAccountList();
			break;
		}
		case 3: {
			showAccountDetail();
			break;
		}
		default:
			System.err.println("잘못입력하셨습니다. 다시입력하세요.");
			showMenu();
		}
		return false;
	}
	
	//신규 개설
	private void createAccount() {
		System.out.println("----- 신규 개설 -----");
		System.out.print("예금주 : ");
		String name = Input.scanString();
		System.out.print("비밀번호 : ");
		String pwd = Input.scanString();
		
		AccountInfo info = new AccountInfo();
		info.setName(name);
		info.setPwd(pwd);
		accountInfoArray[BankSystem.cnt++]=info;
		System.out.println("계좌 개설 완료 !!!");
		
	}
	
	//목록 조회
	private void showAccountList() {
		System.out.println("----- 목록 조회 -----");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+"번 "+accountInfoArray[i].getName());
		}
	}
	
	//상세 조회
	private void showAccountDetail() {
		System.out.println("----- 상세 조회 -----");
		showAccountList();
		System.out.print("조회할 번호를 입력해 주세요 : ");
		int num=Input.scanInt();
		System.out.println("예금주 : "+accountInfoArray[num-1].getName());
		System.out.println("계좌번호 : "+accountInfoArray[num-1].getNumber());
		System.out.println("잔액 : "+accountInfoArray[num-1].getBalance()+"원");
	}

}
