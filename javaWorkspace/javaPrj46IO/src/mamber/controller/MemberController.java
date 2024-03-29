package mamber.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class MemberController {

	private final Scanner sc;
	private final String filepath;
	private final File f;

	public MemberController() {
		filepath = "D:\\dev\\abc.txt";
		f = new File(filepath);
		sc = new Scanner(System.in);
	}

	// 메뉴보여주기
	public void printMenu() throws Exception {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");

		String num = sc.nextLine();
		switch (num) {
		case "1":
			join();
			break;
		case "2":
			login();
			break;

		}
	}

	// 회원가입
	public void join() throws Exception {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pwd = sc.nextLine();
		System.out.println("닉네임 : ");
		String nick = sc.nextLine();

		// 저장(메모장에 저장)
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("아이디 : " + id);
		bw.write("#");
		bw.write("패스워드 : " + pwd);
		bw.write("#");
		bw.write("닉네임 : " + nick);
		bw.write("\n");
		bw.close();

		// 완료알림
		System.out.println("회원가입 완료");

	}

	// 로그인
	public void login() {// 이걸로도 가능함 던지는 거 throws Exception{

		// 입력
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 :");
		String pwd = sc.nextLine();

		FileReader fr;
		BufferedReader br = null;
		try {
			fr=  new FileReader(f);
			br = new BufferedReader(fr);
			// 메모장에서 데이터 읽기

			while (true) {

				String str = br.readLine();
				if (str == null) {
					break;
				}

				// 읽은 데이터 이용하여 로그인 성공여부 판단
				String[] strArr = str.split("#");
				String memoId = strArr[0];
				String memoPwd = strArr[1];
				String memoNick = strArr[2];
				boolean isOk = id.equals(memoId) && pwd.equals(memoPwd);
				if (isOk) {
					System.out.println("로그인 성공!");
					System.out.println(memoNick + " 님 환영합니다 ~ ");
					return;
				}
			} // while
			System.out.println("로그인 실패 ㅠㅠ");
		} catch (Exception e) {
			System.out.println("로그인 하다가 예외 발생함");

		} finally {
			
			try {
				br.close();
				
			}catch(Exception e) {
				System.out.println("close하다가 예외 발생 ~");
			}

		}

	}

}
