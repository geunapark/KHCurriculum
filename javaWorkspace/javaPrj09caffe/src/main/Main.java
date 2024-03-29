package main;

import java.util.Scanner;

public class Main {

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
		
		if(menu==1) {
			sum=cnt*1500;
			System.out.println("메뉴는 : 아이스아메리카노이며, 수량은 "+cnt+" 총 가격은 = "+sum+" 입니다.");
		}else if(menu==2) {
			sum=cnt*2000;
			System.out.println("메뉴는 : 바닐라라떼이며, 수량은 "+cnt+" 총 가격은 = "+sum+" 입니다.");
		}else if(menu==3) {
			sum=cnt*3000;
			System.out.println("메뉴는 : 허니자몽블랙티이며, 수량은 "+cnt+" 총 가격은 = "+sum+" 입니다.");
		}else {
			System.out.println("1~3까지의 숫자를 입력해 주세요");
		}
		
		
	}

}
