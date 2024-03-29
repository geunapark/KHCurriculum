package main;

import java.util.Scanner;

import board.BoardController;
import member.MemberController;
import member.MemberVo;

public class Main {

	public static final Scanner SC = new Scanner(System.in);
	public static MemberVo loginMember = null; //로그인한 유저의 닉네임을 담아둘 변수

	public static void main(String[] args) throws Exception{
		BoardController bc = new BoardController();
		MemberController mc =new MemberController();

		System.out.println("-----CRUD (member) -----");
		
		while(true) {
			System.out.println("1.MEMBER");
			System.out.println("2.BOARD");
			System.out.println("번호를 입력하세요 : ");
			String num = Main.SC.nextLine();
			
			
			
			switch(num) {
			case "1" : mc.printMenu();break;
			case "2" : bc.printMenu(); break;
			case "9" : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못입력하셨습니다");
			}
		}
	}

}
