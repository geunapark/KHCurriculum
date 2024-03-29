package main;

import java.util.Scanner;

import member.Member;

public class Main {
	public static void main(String[] args) {
		System.out.println("=====객체 배열=====");
		Scanner sc=new Scanner(System.in);
		
		int n=2;
		Member[] m=new Member[n];
		m[0]=new Member("admin","1234","admin");
		System.out.println("-----------------");
		System.out.println("0번 종료하기");
		System.out.println("1번 로그인하기");
		System.out.println("2번 회원가입");
		System.out.println("-----------------");
		
		int userInput=Integer.parseInt(sc.nextLine());
		
		switch (userInput) {
		case 0: {
			System.out.println("0번을 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		case 1: {
			System.out.println("1번을 입력하셨습니다. 로그인 하겠습니다.");
			break;
		}
		case 2: {
			System.out.println("2번을 입력하셨습니다. 회원가입을 진행하겠습니다.");			
			System.out.print("회원의 id : ");
			String id=sc.nextLine();
				
			System.out.print("회원의 pwd : ");
			String pwd=sc.nextLine();
			System.out.print("회원의 nick : ");
			String nick=sc.nextLine();
				
			n++;
			m[n-1]=new Member(id,pwd,nick);
			System.out.println();
			break;
		}
			
		
		default:
			System.err.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			return;
		
		}
	
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Member []m=new Member[3];
//		
//		for(int i=0;i<m.length;i++) {
//			m[i]=new Member();
//		}
//		
//		for(int i=0;i<m.length;i++) {
//			System.out.println((i+1)+"번째 멤버");
//			System.out.print("id 입력 : ");
//			m[i].setId(sc.nextLine());
//			System.out.print("pwd 입력 : ");
//			m[i].setPwd(sc.nextLine());
//			System.out.print("nick 입력 : ");
//			m[i].setNick(sc.nextLine());
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<m.length;i++) {
//			System.out.println((i+1)+"번째 멤버");
//			System.out.println("id : "+m[i].getId());
//			System.out.println("pwd : "+m[i].getPwd());
//			System.out.println("nick : "+m[i].getNick());
//			System.out.println();
//		}
		
		
	
}
