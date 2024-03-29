package main;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight=sc.nextDouble();
		
		double tb=0;
		double total=0;
		tb=(height-100)*0.9;
		total=(weight-tb)*100/tb;
		
		
		if(total<=10) {
			System.out.println("정상");
		}else if(total<=20) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		
		
		
		
	}

}
