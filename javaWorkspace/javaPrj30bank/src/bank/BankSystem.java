package bank;

import java.util.Scanner;

public class BankSystem {

	// final : 재할당 불가능. 한 번 넣은 값을 최종값으로 하고 다시 못 넣음.
	// 왜 씀? -> 변수에 다른 값 할당 하지 말라고 . 한 번 넣으면 땡

	private final Scanner sc = new Scanner(System.in); // 밑에 주석 처리와 같은 의미의 코드임.

//	public BankSystem() {
//		this.sc = new Scanner(System.in);
//	}

	// 잔액조회
	public void selectBalance(AccountInfo x) {
		System.out.println(x.getName() + "의 잔액 : " + x.getBalance() + "원");
	}

	// 입금하기
	public void plus(AccountInfo x) {
		System.out.print("입금 할 금액 : ");
		int value = scanNumber();
		x.setBalance(x.getBalance() + value);
		System.out.println("입금 " + value + "원");
	}

	// 출금하기
	public void minus(AccountInfo x) {
		if(x.getPwdFailCnt()>=5) {
			System.out.println("[출금 실패] 비밀번호 5회 이상 틀렸습니다. 계좌 잠김. 은행 ㄱ");
			return;
		}
		
		selectBalance(x);// 잔액 띄우기
		System.out.print("출금 할 금액 : ");
		int value = scanNumber();

		// 비번 검증
		boolean isOk = checkPwd(x); // 계정 정보를 인자로 넘기면서 호출
		if (!isOk) {
			System.err.println("[출금 실패] 비밀번호 불일치");
			return;
		}

		if (x.getBalance() < value) {
			System.err.println("[출금 실패] 잔액이 부족합니다."); // err -> 글씨 빨간색 나옴.
			return;
		}
		x.setBalance(x.getBalance() - value);
		System.out.println("출금 " + value + "원");

	}// minus
	
	
	// 비밀번호 검사
	private boolean checkPwd(AccountInfo x) {
		System.out.print("비밀번호 : ");
		String userInputPwd = sc.nextLine();
		
		if(x.getPwd().equals(userInputPwd)) {
			x.resetPwdFailCnt();
			return true;
		}
		x.increasePwdFailCnt();
		return false;
		
//		a==b(x);
//		a.equals(b); (O)
	}

	// 메뉴 보여주기
	public int showMenu() {
		System.out.println("======심한은행======");
		System.out.println("0. 종료하기");
		System.out.println("1. 잔액 조회");
		System.out.println("2. 입금하기");
		System.out.println("3. 출금하기");
		System.out.print("번호 입력 : ");

		int userInputNumber = scanNumber();
		return userInputNumber;

	}

	// 숫자 받기
	private int scanNumber() { // 객체 안에서만 공유가 될 수있도록 private로 접근제한자 바꾸기
		String str = sc.nextLine();
		int num = Integer.parseInt(str); // 엔터때문에 이렇게 하는 거라고 함.
		return num;

//		int num = sc.nextInt();
//		sc.nextLine();
//		return num; 위와 같음

	}

}
