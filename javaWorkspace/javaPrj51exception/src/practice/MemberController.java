package practice;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import kh.exception.JoinException;

public class MemberController {

	public void join() throws JoinException {
		Scanner sc = new Scanner(System.in);

		// 데이터 입력 받기
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비번 : ");
		String pwd = sc.nextLine();
		System.out.println("닉네임 : ");
		String nick = sc.nextLine();

		// 데이터 검증하기

		checkId(id);
		checkPwd(pwd);
		checkNick(nick);
		// 데이터 뭉치기(==객체)
		System.out.println("데이터 뭉치기~(객체생성)");

		// 저장하기
		System.out.println("저장하기~(배열에 객체저장)");

		System.out.println("회원가입 성공!");

	}

	// 4~12 글자사이
	// admin 이라는 글자 있으면 안됨
	private void checkId(String id) throws JoinException {
		if (id.length() < 4) {
			throw new JoinException("아이디 너무 짧음");
		}
		if (id.length() > 12) {
			throw new JoinException("아이디 너무 긺");
		}
		if (id.contains("admin")) {
			throw new JoinException("관리자 사칭");
		}
	}

	// 길이 4글자 이상이어야됨
	private void checkPwd(String pwd) throws JoinException{
		if (pwd.length() < 4) {
			throw new JoinException("패스워드 너무 짧음");
		}
	}

	// 관리자 안됨
	private void checkNick(String nick) throws RuntimeException{
		if (nick.contains("관리자")) {
			throw new RuntimeException();
		}
	}
}
