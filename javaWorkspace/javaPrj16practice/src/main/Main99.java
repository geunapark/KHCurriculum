package main;

import java.util.Random;
import java.util.Scanner;

public class Main99 {
	
	public static void main(String[] args) {
		
		System.out.println("===== 가위바위보 =====");
		
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		
		//유저 패 입력받기
		for(;;) {
			System.out.print("가위/바위/보 입력 : ");
			String user=sc.nextLine();
			
			//컴퓨터 패 설정 (랜덤)
//			int randNum=rd.nextInt(3)+1;//int randNum=(int)(Math.random()*3+1);
			int randNum=(int)(Math.random()*3+1);
			
//			if(randNum==1) {
//				com="가위";
//			}else if(randNum==2) {
//				com="바위";
//			}else {
//				com="보";
//			}
			
			String com = "";
			
			switch (randNum) {
			case 1: {
				com="가위";
				break;
			}
			case 2:{
				com="바위";
				break;
			}
			case 3:{
				com="보";
				break;
			}
			}
			
			//컴퓨터 패 출력하기
			System.out.println("컴퓨터 : "+com);
			
			//String 문자열은 비교할때 == 가아닌 equals("")를 사용
			if(user.equals("가위") && com.equals("보")
					||user.equals("바위") && com.equals("가위")
					||user.equals("보") && com.equals("바위")) {
				System.out.println("유저 승리");
				break;
			}else if(user.equals("가위") && com.equals("바위")
					||user.equals("바위") && com.equals("보")
					||user.equals("보") && com.equals("가위")) {
				System.out.println("유저 패배");
			}else {
				System.out.println("무승부");
			}
		}
		

		
		
		//Enter키 기준으로 한줄 입력받을수 있음
		
		
		
		
		
		
		/*
		System.out.println("for문을 활용한 마름모 만들기");
		
		int i,j;
		int star;
	
        
        for (i=0;i<5;i+=2) {
        	for(j=5;j>=i;j-=2) {
        		System.out.print(" ");
        	}
        	for(star=0;star<=i;star++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        for (i =0;i<=5-2;i+=2) {   
            System.out.print(" ");
            for (j=0;j<=i;j+=2) {  
                System.out.print(" ");
            }
            for (star=5-2;star>i;star--) { 
                System.out.print("*");
            }
            System.out.println();
        }
	
	*/
	
	}

}
