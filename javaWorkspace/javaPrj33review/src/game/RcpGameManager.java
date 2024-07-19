package game;

import java.util.Scanner;

import main.Main;

public class RcpGameManager {
	
	public void gameStart() {
		// 가위바위보 게임 만들기

				System.out.println("======가위바위보======");
				// 컴퓨터 패 준비
				// 유저 패 입력받기
				// 판단하고 출력
				
				int win = 0;
				int lose = 0;
				int draw = 0;
				
				while (true) {
					int com = (int) (Math.random() * 3 + 1);
					System.out.println("1(가위), 2(바위), 3(보자기) 중 하나를 입력하세요. (0은 종료)> ");
					int user = Main.sc.nextInt();

					if (user == 0) {
						System.out.println("0을 입력하셨습니다. 프로그램 종료.");
						break;
						}

						// 유저 입력값 검사(1,2,3 중 하나인지)
						if (user > 3) {
							System.out.println("잘못된 입력입니다. 1,2,3 중 입력하세요. > ");
							// 반복문 시작으로 돌아가세요
							continue;
						}

						if (com == 1) {
							System.out.println("컴퓨터 : 가위");
						} else if (com == 2) {
							System.out.println("컴퓨터 : 바위");
						} else {
							System.out.println("컴퓨터 : 보자기");
						}

						if (com == user) {
							System.out.println("무승부");
							draw++;
						} else if (com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
							System.out.println("승리");
							win++;
						} else if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
							System.out.println("패배");
							lose++;
						}

					}
				System.out.println("------스코어-------");
				System.out.println("승: " + win + "/ 패: " + lose + "/ 무: " + draw);

				}//method
		
	}
	
	

