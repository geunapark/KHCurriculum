package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== 제어문(조건문 - switch) =====");
		
		// ?월이 몇일까지 있는지 알려주는 프로그램
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력해 주세요");
		int month=sc.nextInt();
		
		switch (month) {
		case 1,3,5,7,8,10,12: {
			System.out.println("31일 까지 있습니다.");
			break;
		}
		case 4,6,9,11:{
			System.out.println("30일 까지 있습니다.");
			break;
		}
		case 2:{
			System.out.println("28일까지 있습니다.");
			break;
		}
		default:
			System.out.println("1~12까지의 숫자만 입력해 주세요");
			break;
		}
		
		/*
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			System.out.println(month+"월은 31일까지 있습니다.");
		}else if(month==4||month==6||month==9||month==11) {
			System.out.println(month+"월은 30일까지 있습니다.");
		}else if(month==2) {
			System.out.println(month+"월은 28일까지 있습니다.");
		}
		*/
	}

}
