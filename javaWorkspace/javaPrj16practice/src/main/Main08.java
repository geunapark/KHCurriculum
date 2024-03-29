package main;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 n을 입력하세요 : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
