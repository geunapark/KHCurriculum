package main;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 한개를 입력하세요 : ");
		int x=sc.nextInt();
		if(x==0) {
			System.out.println("0입니다.");
		}else if(x>0) {
			System.out.println("양수 입니다.");
		}else if(x<0) {
			System.out.println("음수 입니다.");
		}
	}

}
