package game;

import main.Main;

public class GameManager {
	public void miniGameStart() {
		System.out.println("===== 미니게임 =====");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 가위바위보 게임");
		System.out.println("2. 업다운 게임");
		System.out.print("원하시는 게임 번호 : ");
		
		//클래스명.변수...
		String input=Main.sc.nextLine();
		
		switch (input) {
		case "0": {
			System.out.println("0번을 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		case "1": {
			new RcpGameManager().gameStart();
			break;
		}
		case "2": {
			new UpdownGameManager().gameStart();
			break;
		}
		default:
			System.err.println("잘못 입력 하셨습니다. 다시 입력하세요.");
		}
	}

}
