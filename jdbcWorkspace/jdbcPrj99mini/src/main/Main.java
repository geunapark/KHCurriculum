package main;

import java.util.Scanner;

import board.BoardController;
import member.MemberController;
import member.MemberVo;

public class Main {
	public static final Scanner SC = new Scanner(System.in);
	public static MemberVo loginMember = null;
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		BoardController bc = new BoardController();

		while(true) {
			
			System.out.println("-----mini-----");
			if(loginMember != null ) {
				System.out.println(loginMember.getNick() + "님 환영합니다~ ");
			}else {
				System.out.println("게스트님 환영합니다~");
			}
			System.out.println("1. MEMBER");
			System.out.println("2. BOARD");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 :");
			String num = Main.SC.nextLine();
		
			
			try {
				switch(num) {
				case "1" : mc.printMenu(); break;
				case "2" : bc.printMenu(); break;
				case "9" : System.out.println("프로그램 종료,,,"); return;
				default : System.out.println("잘못입력하셨습니다");
				
				}
				
			}catch(Exception e) {
				System.out.println("예외 발생 ~~~~");
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
