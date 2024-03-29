package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== 가위바위보 =====");
		
		//컴퓨터 패 준비
		//유저 패 입력 받기
		//판단하기 출력하기
		Scanner sc= new Scanner(System.in);
		Random rd= new Random();
		
		int cnt=0;
		int win=0;
		int lose=0;
		int draw=0;
		
		while(true) {
			int com=rd.nextInt(3)+1;//int com=(int)(Math.random()*3+1);
			
			System.out.print("1번 가위\n2번 바위\n3번 보자기\n(0번 입력시 프로그램 종료 1~3)의 숫자를 입력 : ");
			int user=sc.nextInt();
			
			
			
			if(user==0) {
				System.out.println("0을 입력하셨습니다. 프로그램을 종료하겠습니다.");
				break;
			}else if(user<1 || user>3) {
				System.out.println("잘못된 입력입니다. 1,2,3 중 입력하세요");
				continue;
			}
			
			
			if(com==1) {
				System.out.println("컴퓨터 : 가위");
			}else if(com==2) {
				System.out.println("컴퓨터 : 바위");
			}else {
				System.out.println("컴퓨터 : 보자기");
			}
			
			
			
			if(com==user) {
				System.out.println("무승부");
				draw++;
			}else if(com==1&&user==2 || com==2&&user==3 || com==3&&user==1){
				System.out.println("승리");
				win++;
			}else if(com==1&&user==3 || com==2&&user==1 || com==3&&user==2) {
				System.out.println("패배");
				lose++;
			}
			cnt++;
			
		}
		
		System.out.println("총 : "+cnt+"번 수행하셨습니다");
		System.out.println("이긴횟수 : "+win);
		System.out.println("비긴횟수 : "+draw);
		System.out.println("진횟수 : "+lose);
		
		
		
		
		
	}

}
