package main;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("스타벅스");
		System.out.println("메뉴판");
		System.out.println("1. 아이스아메리카노 2000원");
		System.out.println("2. 카페라떼 3000원");
		System.out.println("3. 자몽허니블랙티 4000원");
		System.out.print("닉네임을 입력해 주세요 : ");
		String name=sc.nextLine();
		System.out.print("메뉴 번호를 입력해 주세요 : ");
		String num=sc.nextLine();
		int i=Integer.parseInt(num);
		System.out.print("요청 사항을 입력해 주세요 : ");
		String msg=sc.nextLine();
		String menu="";
		if(i==1) {
			menu="아이스 아메리카노";
		}else if(i==2) {
			menu="카페라떼";
		}else {
			menu="자몽허니블랙티";
		}
		
		System.out.println(name+"님 환영합니다."+"주문하신 메뉴는 "+menu+"이고 요청사항은 "+msg+"입니다.");
	}

}
