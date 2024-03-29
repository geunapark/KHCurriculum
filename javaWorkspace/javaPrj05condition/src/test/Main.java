package test;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//제어문 (조건문)
		
		/*
		 * if, else, else if
		 * 
		 * <문법>
		 * if(조건식){실행내용}
		 * 
		 * if : 조건식의 결과값이 true 이면, 실행내용 ㄱㄱ 조건식의 결과값이 false 이면, 실행내용 ㄴㄴ
		 * else : if 뒤에 작성할 수 있음. 앞의 조건을 통과하지 못하면 실행됨.
		 * else if :  if 뒤에 작성할 수 있음. 앞의 조건을 통과하지 못하면 조건식 검사함.
		 * 
		 * 
		 * 조건식 : 실행결과가 논리값이 나오는 연산
		 * 
		 * 
		 */
		
		
		System.out.println("=====제어문=====");
		
//		int x=2;
//		if(x==1) {
//			System.out.println("x 값은 1 입니다.");
//		}
//		if(x==2) {
//			System.out.println("x 값은 2 입니다.");
//		}
		
//		System.out.println("정수를 입력하세요");
//		Scanner si= new Scanner(System.in);
//		
//		
//		if (si.nextInt()>0) {
//			System.out.println("양수");
//		} else if(si.nextInt()==0) {
//			System.out.println("0");
//		} else {
//			System.out.println("움수");
//		}
//		
//		int x=10;
//		if (x>0){
//			System.out.println("+");
//		}else if(x==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("-");
//		}
//		
//		if (x==10){
//			System.out.println("10");
//		}else if(x==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("-");
//		}
//		int x=10;
//		
//		if(x>0) {
//			if(x==10) {
//				System.out.println("양수, 10");
//			}
//		}
		
		System.out.println("정수를 입력하세요");
		Scanner sc= new Scanner(System.in);	//입력받을 준비 == 입력받을 도구 생성
		int x=sc.nextInt();					//입력받기 == 도구사용하여 입력받음
		
		
		if (x>0){
			System.out.println("+");
		}else if(x==0) {
			System.out.println("0");
		}else {
			System.out.println("-");
		}
		
		
		
		
		
	}

}
