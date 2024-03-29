package main;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 1개를 입력해 주세요 : ");
		int x=sc.nextInt();
		if(x%7==0) {
			System.out.println("7의 배수 맞음");
		
		}else {
			System.out.println("7의 배수 아님");
		}
	}
	

}
