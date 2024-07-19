package main;

import java.util.Scanner;

public class MethodPractice {
	
	//헬로 월드라고 출력하는 메소드 만들기 
	public void printHello() {
		System.out.println("hello world");
	}
	
	/*
	 * 전달 받는 인자 값 없음
	 * 리턴값 없음
	 * 
	 * 
	 * 메소드 이름은 sayHi
	 * 실행 내용 : Hi라고 출력
	 */
	
	public void sayHi() {
		System.out.println("Hi");
	}
	
	public void judgeNumber(int x) {
		
		if(x>0) {
			System.out.println("양수");
		}else if(x<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
	
	public void printNumbers() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	public void printNumbers(int n) {
		for(int i = 1; i <=n; i++) {
			System.out.println(i);
		}
	}
	
	public void plus(int a, int b) {
		System.out.println(a+b);
	}
	
	public int getPlusResult(int a, int b) {
		return a+b;
	}
	
	
	
	
	
	
	

}//class
