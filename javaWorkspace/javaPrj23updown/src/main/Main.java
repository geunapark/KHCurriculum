package main;



public class Main {
	

	public static void main(String[] args) {
		UpdownGameManager gm=new UpdownGameManager();
//		gm.gameStart();
		int a=gm.getRandomAnswer();
		System.out.println(a);
		
		boolean b= 5>10;
		
		if(b) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
	}
//클래스 변수이름 = new클래스();
}
