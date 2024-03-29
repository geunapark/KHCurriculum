package main;

import java.util.Scanner;

public class Gugudan_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a 입력");
		int a=sc.nextInt();
		System.out.println("b 입력");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = " +(i*j));
			}
			System.out.println();
		}
	}

}
