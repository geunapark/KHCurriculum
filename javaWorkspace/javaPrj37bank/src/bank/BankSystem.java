package bank;

import util.Input;

public class BankSystem {

	public static AccountInfo[] accountInfoArray = new AccountInfo[100];
	public static int cnt = 0;

	// 메뉴
	public boolean showMenu() {
		System.out.println("------ 메인 메뉴 ------");
		System.out.println("0. 종료 하기");
		System.out.println("1. 신규 개설");
		System.out.println("2. 목록 조회");
		System.out.println("3. 상세 조회");

		System.out.print("메뉴 번호 입력 : ");
		int num = Input.scanInt();

		switch (num) {
		case 0:
			System.out.println("프로그램 종료");
			return true;
		case 1:
			createAccount();
			break;
		case 2:
			showAccountList();
			break;
		case 3:
			showAccountDetail();
			break;
		default:
			System.out.println("잘못된 입력입니다.");

		}// switch
		return false;
	}

	// 신규 계좌 개설
	private void createAccount() {
		System.out.println("----- 신규 개설 -----");
		System.out.println("예금주 : ");
		String name = Input.scanString();
		System.out.println("비밀번호 : ");
		String pwd = Input.scanString();
		
		//객체 준비
		AccountInfo info = new AccountInfo();
		info.setName(name);
		info.setPwd(pwd);
		
		//저장
		
		accountInfoArray[cnt++] = info; //클래스명 안써도 됨 . 같은 파일이니까.
		//accountInfoArray[cnt] = info;
		//cnt++ 과 같음
		
		//안내 문구
		System.out.println("계좌 개설 완료!!");
		
		
	}

	// 계좌 목록 조회
	private void showAccountList() {
		
		for(int i = 0; i <cnt; ++i) {
			System.out.println( i +"번 "+accountInfoArray[i].getName());
		}									//객체의 주소값
		
	}//method

	// 상세 조회
	private void showAccountDetail() {
		
		showAccountList();
		
		System.out.print("조회할 계좌 번호 : ");
		int num = Input.scanInt();
		
		System.out.println("예금주		: "+ accountInfoArray[num].getName() );
		System.out.println("계좌번호	: "+ accountInfoArray[num].getNumber() );
		System.out.println("잔액		: "+ accountInfoArray[num].getBalance()+" 원");
		
		
	}

}
