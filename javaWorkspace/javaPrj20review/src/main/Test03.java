package main;

import java.util.Scanner;

public class Test03 {
	public void method01() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x=sc.nextInt();
		if(x>0) {
			System.out.println("양수");
		}else if(x<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
	public void method02() {
		Scanner sc=new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : ");
		int month=sc.nextInt();
		int day=0;
		switch (month) {
		case 2: {
			day = 28;
			break;
		}
		case 1,3,5,7,8,10,12:{
			day=31;
			break;
		}
		case 4,6,9,11:{
			day=30;
			break;
		}
		default:{
			System.out.println("그런달은 존재하지 않습니다.");
			return;
		}
		
		}
		System.out.println(month+"의 달은 "+day+"일 까지 있습니다.");
	}

}
