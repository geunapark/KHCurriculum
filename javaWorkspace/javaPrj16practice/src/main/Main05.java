package main;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("100이하의 자연수 n룰 입력해주세요");
		int n=sc.nextInt();
		int sum=0;
		
		if(n>100) {
			System.out.println("100초과입니다.");
			return;
		}
		
		for(int i=1;i<=n;i++) {
			
			sum+=i;
		}
		System.out.println("1~"+n+" 까지의 총합은 : "+sum);
	}

}
