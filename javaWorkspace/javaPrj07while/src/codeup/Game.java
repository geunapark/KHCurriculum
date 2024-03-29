package codeup;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc=new Scanner(System.in);
		int x,y;
		x=rd.nextInt(100)+1;
		
		while(true) {
			System.out.print("1~100까지의 정수를 입력하세요 : ");
			
			y=sc.nextInt();
			if(x>y) {
				System.out.println("up");
				continue;
			}else if(x<y) {
				System.out.println("down");
				continue;
			}else {
				System.out.println("정답");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
