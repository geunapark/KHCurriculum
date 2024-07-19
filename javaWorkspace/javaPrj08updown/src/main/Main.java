package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 정답 숫자 준비
		int randomNum = (int) (Math.random() * 100 + 1);
		//시도한 횟수 선언
		int cnt = 0;
		// 입력받을 도구 준비
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1~100 까지 숫자를 입력 > ");
			// 유저한테 입력받기
			// 입력받은 값을 변수에 저장
			int userInput = sc.nextInt();
			//시도 한 횟수 증가
			cnt = cnt +1;
			
			// 업 다운 정답 판단
			if (userInput > randomNum) {
				System.out.println("다운");
			} else if (userInput < randomNum) {
				System.out.println("업");
			} else {
				System.out.println("정답");
				System.out.println("시도 횟수 : " + cnt);
				break;
			}

		}
	}

}
