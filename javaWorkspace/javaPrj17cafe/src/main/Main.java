package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 스타벅스 =====");
		System.out.print("닉네임을 입력해 주세요 : ");
		String name=sc.nextLine();
		System.out.print(name+"님 환형합니다!\n"+"메뉴판\n1.아아 : 2000\n2.라떼 : 3000\n3.자허블 : 4000\n"
				+ "메뉴룰 입력해 주세요 : ");
		String menu=sc.nextLine();//(java String to int)search!
//									만약 메뉴가 int menuNum=sc.nextInt()라면
//									sc.nextLine();한줄을 더 추가한다.
//									하지만 그냥 int menuNum=sc.nextLine()으로 받아도 상관없음
//									깔끔하고 편리 앞으로 입력받는것은 무족건 nextLine()사용
//									int menuNum=Integer.parseInt(menu);
//				`					
		System.out.print("요청사항을 입력해주세요 : ");
		String msg=sc.nextLine();
		int much=0;
		
		
		if(menu.equals("아아")||menu.equals("1")) {
			much=2000;
			menu="아이스 아메리카노";
		}else if(menu.equals("라떼")||menu.equals("2")) {
			much=3000;
			menu="카페라떼";
		}else if(menu.equals("자허블")||menu.equals("3")){
			much=400;
			menu="자몽허니블랙티";
		}else {
			System.out.println("잘못입력하셨습니다. 접수불가능합니다.");
			return;
		}
		
		
		System.out.println(name+"님 주문하신 메뉴나왔습니다.\n주문하신 메뉴는 "+menu+" 이며 가격은 "+much+" 입니다. 요청사항은 "
				+ msg+" 입니다.");
		
		
		
	}

}
