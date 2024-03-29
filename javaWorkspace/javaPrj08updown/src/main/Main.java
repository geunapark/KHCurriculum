package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//랜덤 도구 준비
		Random rd = new Random();
		
		//입력 도구 준비
		Scanner sc=new Scanner(System.in);
		
		int rand,user;
		int cnt=0;
		
		
		//정답 준비
		rand=rd.nextInt(100)+1;	//rand=(int)(Math.random*100+1);
		
		//무한 반복문
		while(true) {
			System.out.print("1~100까지의 정수를 입력하세요 : ");
			//입력받은 값을 변수에 저장
			user=sc.nextInt();
			cnt++;
			//판단하기
			if(rand>user) {
				System.out.println("up");
				continue;
			}else if(rand<user) {
				System.out.println("down");
				continue;
			}else {
				System.out.println("정답 맞춘 횟수 :"+cnt);
				//종료
				break;
			}
			
			
		}
		System.out.println("프로그램을 종료하겠습니다.");
		
	
	}

}