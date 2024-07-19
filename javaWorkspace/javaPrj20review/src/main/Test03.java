package main;

import java.util.Scanner;

public class Test03 {

	public void method01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 > ");
		int x = sc.nextInt();
		if (x > 0) {
			System.out.println("양수 입니다.");
		} else if (x < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}// method01(제어문)

	public void method02() {
		// 해당 월은 몇일 까지 있는지 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 > ");
		int x = sc.nextInt();
		switch (x) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("29");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		default:
			System.out.println("1~12 중에서 입력하세요 > ");
		}

	}

}
