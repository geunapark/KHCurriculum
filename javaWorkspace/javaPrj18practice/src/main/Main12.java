package main;

import java.util.Random;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rd=new Random();
		int cnt=0;
		
		int y=rd.nextInt(100)+1;
		while(true) {
			System.out.println("숫자를 입력하세요");
			int x=sc.nextInt();
			cnt++;
			
			if(x>y) {
				System.out.println("down");
			}else if(x<y) {
				System.out.println("up");
			}else {
				System.out.println("정답입니다."+cnt);
				break;
			}
		}
		
	}

}
