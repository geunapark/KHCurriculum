package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// updown 게임 다시

		// 1. 정답 준비 (랜덤값1~100)
		// 2. 출력문 (안내문구: 1~100 사이의 숫자를 입력하세요.)
		// 3 .유저 입력 받기
		// 4. 입력받은 값 판단하기(업,다운, 정답)
		// 5 .판단 결과에 따라
		// - 안내문구 출력 (업) => 2번부터 반복
		// - 안내문구 출력 (다운) =>2번부터 반복
		// - 안내문구 출력 (정답) => 프로그램 종료 == 메인메소드 종료
		int com =(int)( Math.random() * 100 + 1);
		
		System.out.println(com);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1~100사이의 숫자를 입력하세요. > ");
			int x = sc.nextInt();
			if (com > x) {
				System.out.println("업");
			} else if (com < x) {
				System.out.println("다운");
			} else {
				System.out.println("정답");
				break;
			}

		}

	}

}
