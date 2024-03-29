package main;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 a 입력 : ");
		int a=sc.nextInt();
		System.out.print("정수 b 입력 : ");
		int b=sc.nextInt();
		
		int max,min;
		
		if(a>b) {
			max=a;
			min=b;
		}else if(b>a) {
			max=b;
			min=a;
		}else {
			System.out.println("a와 b는 같음 : "+a);
			return;
		}
		
		for (int i=min;i<=max;i++) {
			System.out.println(i);
		}
	}

}
