package main;

import java.util.Scanner;

public class RetryMainUpdown {

	public static void main(String[] args) {

		// 1. 업다운 컴퓨터가 맞히기
		// 2. 유저가 업다운 말하기
		// 업다운 판단
		
		Scanner sc = new Scanner(System.in);
		//업 다운 말하기
		int Computer = (int) (Math.random() * 100 + 1);
		// 사용자 랜덤 숫자 준비(정답)
		int userThink = (int) (Math.random() * 100 + 1);
		// 랜덤 정답
		System.out.print("사용자 정답 : ");
		System.out.println(userThink);
		
		while (true) {
			System.out.println("컴퓨터 답: " + Computer);
			System.out.println("업 , 다운 , 정답 중 하나 고르세요 > ");
			int user = sc.nextInt();
			
			if (user == 1){
				Computer--;
				System.out.println(Computer);
			}
			else if (user == 2) {
				Computer++;
				System.out.println(Computer);
			} else {
				System.out.println("정답");
				break;
			}
		}
	}

}
