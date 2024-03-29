package main;

import java.util.Random;
import java.util.Scanner;

public class PraticeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		
		int cnt=0;
		int rand=rd.nextInt(100)+1;
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int user=sc.nextInt();
			cnt++;
			if(cnt>=10) {
				System.out.println("패배");
				break;
			}else {
				if(rand>user) {
					System.out.println("up");
				}else if(rand<user) {
					System.out.println("down");
				}else {
					System.out.println("정답입니다. 맞춘횟수 : "+cnt);
					break;
				}
			}
		}
		
	}

}
