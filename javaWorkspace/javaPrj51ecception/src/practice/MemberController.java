package practice;

import java.util.Scanner;

import khexception.JoinException;



public class MemberController {

	public void join()throws JoinException{

		Scanner sc = new Scanner(System.in);

		// 데이터 입력받기
		System.out.print("아이디 :");
		String id = sc.nextLine();
		System.out.print("비번 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();

//		try {
			// 데이터 검증하기
			checkId(id);
			checkPwd(pwd);
			checkNick(nick);
//
//			// 데이터 뭉치기(== 객체)
//			System.out.println("데이터 뭉치기~~~(객체생성)");
//			// 저장하기
//			System.out.println("저장하기 ~~~( 배열에 객체 저장)");
//
//			System.out.println("회원가입 성공");
//		} catch (RuntimeException e) {
//			System.out.println("회원가입 실패....");
//		}

	}

	// 데이터 뭉치기(== 객체)

	// 저장하기

	private void checkId(String id) throws JoinException {
		if (id.length() < 4) {
			throw new JoinException("아이디가 너무 짧음");
		}
		if (id.length() > 12) {
			throw new JoinException("아이디가 너무 긺");
		}
		if (id.contains("admin")) {
			throw new JoinException("관리자 사칭");
		}

	}

	// 길이4글자 넘어야함
	private void checkPwd(String pwd) {
		if (pwd.length() < 4) {
			throw new RuntimeException();
		}
	}

	// 관리자 안됌
	private void checkNick(String nick) {
		if (nick.contains("관리자")) {
			throw new RuntimeException();
		}

	}
}
