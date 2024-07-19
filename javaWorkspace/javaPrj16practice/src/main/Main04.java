package main;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해 주세요 > ");
		int t = sc.nextInt();
		System.out.println("몸무게를 입력해 주세요 > ");
		int w = sc.nextInt();

		double argW = (t - 100) * 0.9;
		double fat = (double) (((w - argW) * 100) / argW);

		System.out.println("----비만도 계산 ----");
		System.out.println("표준 몸무게 : " + argW);
		if (w < argW) {
			System.out.println("비만도 : "+ ((argW - w) * 100) / argW);
		} else {
			System.out.println("비만도 : " + fat);
		}
		if (fat < 10) {
			System.out.println("정상입니다.");
		} else if (fat < 20) {
			System.out.println("과체중입니다.");
		} else if (fat > 20) {
			System.out.println("비만입니다.");
		}

	}

}
