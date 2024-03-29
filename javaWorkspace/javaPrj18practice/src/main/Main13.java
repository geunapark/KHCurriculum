package main;

import java.util.Random;
import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int rand=rd.nextInt(100)+1;
		
		
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int x=sc.nextInt();
			
			if(x>rand) {
				System.out.println("down");
			}else if(x<rand) {
				System.out.println("up");
			}else {
				System.out.println("정답입니다.");
				break;
			}
		}
		
		
		
	}

}
