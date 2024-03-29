package game;


import main.Main;

public class UpdownGameManager {
	public void gameStart() {
		//업다운 게임
		
		//1. 정답준비 1~100랜덤 값
		//2. 안내 문구 출력 1~100 사이의 숫자를 입력하세요
		//3. 유저 입력 받기
		//4. 입력받은 값 판단하기(업, 다운, 정담)
		//5. 판단 결과에 따라
		// - 안내문구 출력 (업)		=> 2번부터 반복
		// - 안내문구 출력 (다운)	=> 2번부터 반복
		// - 안내문구 출력 (정답) 	=> 프로그램 종료 == 메인메소드 종료
		

		int rand=Main.sc.nextInt(100)+1;//(int)(Math.random()*100+1)
		int cnt=0;
		
		while(true) {
			System.out.print("(1~100)사이의 숫자를 입력하세요 : ");
			int user=Main.sc.nextInt();
			cnt++;
			if(rand>user) {
				System.out.println("up");
			}else if(rand<user) {
				System.out.println("down");
			}else {
				System.out.println("정답입니다. 맞춘 횟수는 : "+cnt+" 입니다.");
				break;
			}
		}
		
	}

}
