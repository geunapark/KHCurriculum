package main;

import java.util.Random;
import java.util.Scanner;

public class UpdownGameManager {
	
	
	public void gameStart() {
		Scanner sc=new Scanner(System.in);
		
		int answer=getRandomAnswer();//(int)(Math.random()*100+1)

		
		while(true) {
			
			System.out.print("(1~100)사이의 숫자를 입력하세요 : ");
			
			int user=sc.nextInt();
			
			
		
			Boolean isOk=checkInput(answer,user);
			
			
			if(isOk) {
				break;
			}
			
		}
	}//gameStart()
//	
	
	
	public int getRandomAnswer() {
		Random rd= new Random();
		return rd.nextInt(100)+1;
	}//getRandomAnser
	
	
	public boolean checkInput(int answer,int user) {

		if(answer>user) {
			System.out.println("up");
		}else if(answer<user) {
			System.out.println("down");
			
		}else {
			System.out.println("정답입니다.");
			return true;
		}
		return false;
	}//checkInput
	

}
