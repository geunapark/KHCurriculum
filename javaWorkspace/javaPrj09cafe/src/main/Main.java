package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 카페 키오스크
		/*
		 * 메뉴보여주기 메뉴 입력받기(유저입력) 수량 입력받기
		 * 
		 * 메뉴, 수량, 총 가격 출력하기
		 */

		System.out.println("======== 스타벅스 ========");

		// 메뉴판
		System.out.println("1.아메리카노		(1500원)");
		System.out.println("2. 카페라떼			(2500원)");
		System.out.println("3. 다크리카노		(3000원)");

		// 입력도구 준비
		Scanner sc = new Scanner(System.in);

		// 입력 받기 (저장하는 이유 : 유저가 입력한 메뉴 번호가 들어있어서)
		System.out.print("메뉴 번호 > ");
		int menuNum = sc.nextInt();

		// 수량 입력 받기
		System.out.print("메뉴 수량 > ");
		int menuCnt = sc.nextInt();
		
		//메뉴 가격을 기록하기 위한 변수 미리 준비함.
		int menuPrice = 0;

		// 주문 정보 출력하기(메뉴이름, 수량, 가격)
		System.out.println("--------- 주문 확인 ---------");
		
		
		if(menuNum == 1) {
			System.out.println("주문하신 메뉴는 아메리카노 입니다.");
		}else if(menuNum == 2 ) {
			System.out.println("주문하신 메뉴는 카페라떼 입니다.");
		}else if(menuNum == 3){
			System.out.println("주문하신 메뉴는 다크리카노 입니다.");
		}
		System.out.println("메뉴 수량은 "+ menuCnt +"개 입니다.");
		
		
		if(menuNum == 1) {
			menuPrice = 1500;
		}else if(menuNum == 2 ) {
			menuPrice = 2500;
		}else if(menuNum == 3){
			menuPrice = 3000;
		}
		int totalPrice= menuPrice * menuCnt;
		System.out.println("총 가격은 "+ totalPrice +"원 입니다.");
		
//		System.out.println("메뉴 이름 : " + 변수);
//		System.out.println("수량 : " + 변수);
//		System.out.println("총 가격 : " + 변수);

	}

}
