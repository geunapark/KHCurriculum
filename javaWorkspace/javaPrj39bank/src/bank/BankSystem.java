package bank;

import util.input.MyScanner;

public class BankSystem {
	
	//상수는 대문자로 이름 짓기
	//상수 : 항상 같은 값을 가짐 == public static final
	public static final Account [] ACCOUNT_ARRAY=new Account[100];
	public static int cnt=0;
	//메인메뉴
	public boolean showMenu() {
		System.out.println("===== 메인메뉴 =====");
		System.out.println("0. 종료하기");
		System.out.println("1. 신규개설");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		
		System.out.print("메뉴 번호 : ");
		int num = MyScanner.scanInt();
		
		switch (num) {
		case 0: {
			System.out.println("0을 입력하셨습니다. 종료하겠습니다.");
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
			System.err.println("잘못입력하셨습니다. 다시 입력해 주세요.");
		}
		return false;
		
	}
	
	//계좌개설
	private void createAccount() {
		//입력받기
		System.out.println("----- 계좌 개설 -----");
		System.out.print("예금주 : ");
		String name = MyScanner.scanString();
		System.out.print("비밀번호 : ");
		String pwd = MyScanner.scanString();
		System.out.print("이제한도 : ");
		int limit = MyScanner.scanInt();
		
		//데이터 뭉치기 (객체생성)
		Account x = new Account();
		x.setName(name);
		x.setPwd(pwd);
		x.setLimit(limit);
		
		//저장하기
		ACCOUNT_ARRAY[cnt]=x;
		cnt++;
		System.out.println("저장 완료!!!");
		
	}
	
	//목록조회
	private void showAccountList() {
		System.out.println("----- 목록 조회 -----");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+"번 "+ACCOUNT_ARRAY[i].getName());
		}
		System.out.println("-------------------");
		
		
	}
	
	//상세조회
	private void showAccountDetail() {
		System.out.println("----- 상세 조회 -----");
		showAccountList();
		System.out.print("조회할 번호를 입력해 주세요 : ");
		int num=MyScanner.scanInt();
		System.out.println("예금주 : "+ACCOUNT_ARRAY[num-1].getName());
		System.out.println("계좌번호 : "+ACCOUNT_ARRAY[num-1].getNumber());
		System.out.println("잔액 : "+ACCOUNT_ARRAY[num-1].getBalance());
		System.out.println("비밀번호 실패 횟수 : "+ACCOUNT_ARRAY[num-1].getFailCnt());
		System.out.println("출금,이체 한도 : "+ACCOUNT_ARRAY[num-1].getLimit());
		
		printDetailMenu(ACCOUNT_ARRAY[num-1]);
		
		
	}
	
	
	//상세조회 메뉴
	private void printDetailMenu(Account account) {
		System.out.println("----- 상세 메뉴 -----");
		System.out.println("0. 돌아가기");
		System.out.println("1. 입금하기");
		System.out.println("2. 출금하기");
		System.out.println("-------------------");
		int num=MyScanner.scanInt();
		
		switch (num) {
		case 0: {
			System.out.println("돌아가기...");
			return;
		}
		case 1: {
			plus(account);
			break;
		}
		case 2: {
			minus(account);
			break;
		}
		default:
			System.err.println("잘못입력하셨습니다. 다시입력해 주세요.");
		}
	}
	//상세조회 메뉴 ->입금
	private void plus(Account account) {
		System.out.println("----- 입금 -----");
		System.out.print("입금할 금액 : ");
		int value=MyScanner.scanInt();
		account.setBalance(account.getBalance()+value);
		System.out.println(value+"원 입금완료 !");
		System.out.println("잔액 : "+account.getBalance());
	}
	//상세조회 메뉴 ->출금
	private void minus(Account account) {
		System.out.println("----- 출금 -----");
		System.out.print("출금할 금액 : ");
		int value=MyScanner.scanInt();
		//비밀번호 확인 ~~~
		System.out.print("비밀번호 : ");
		String inputPwd=MyScanner.scanString();
		if(!inputPwd.equals(account.getPwd())) {
			account.setFailCnt(account.getFailCnt()+1);
			System.out.println(account.getFailCnt()+"번 비밀번호 틀림");
			return;
		}
		account.setFailCnt(0);
		account.setBalance(account.getBalance()-value);
		System.out.println(value+"원 출금완료 !");
		System.out.println("잔액 : "+account.getBalance());
		
		
		
	}
	
	//이체

}
