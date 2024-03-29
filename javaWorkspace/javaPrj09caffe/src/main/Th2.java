package main;

import java.util.Scanner;

public class Th2 {

	public static void main(String[] args) {
//		변수: camelCase 소문자_대문자
//		클래스: PascalCase 대문자_대문자
		
		
		
		System.out.println("=====스타벅스=====");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.아이스아메리카노 : 1500 \n2.바닐라라떼 : 2000 \n3.허니자몽블랙티 : 3000");
		System.out.println("================");
		System.out.print("메뉴를 선택해 주세요 (1~3) : ");
		int menu=sc.nextInt();
		
		System.out.println("----------------");
		
		System.out.print("수량을 입력해주세요 : ");
		int cnt=sc.nextInt();
		
		System.out.println("================");
		
		int sum=0;
		int pri=0;
		
		if(menu==1) {
			pri=1500;
			System.out.println("메뉴는 : 아이스아메리카노 입니다. ");
		}else if(menu==2) {
			pri=2000;
			System.out.println("메뉴는 : 바닐라라떼 입니다. ");
		}else if(menu==3) {
			pri=3000;
			System.out.println("메뉴는 : 허니자몽블랙티입니다. ");
		}else {
			System.out.println("잘못입력했어요");
		}
		
		System.out.println("메뉴 수량은 "+cnt+" 개 입니다.");
		sum=pri*cnt;
		System.out.println("총 가격은 "+sum+" 원입니다.");
		
		
	}

}
