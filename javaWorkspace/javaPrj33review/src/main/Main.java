package main;

import java.util.Random;
import java.util.Scanner;

import game.GameManager;

public class Main {
	//static 영역 특징 2가지
	//1. 어디서든 접근 가능하다.
	//2. 프로그램의 시작부터 종료까지 계속 존재한다.
	//static var==class var
	public static final Scanner sc=new Scanner(System.in);
	public static final Random rd= new Random();
	
	public static void main(String[] args) {
		new GameManager().miniGameStart();
		
	}
	/*
	 * 클래스란? 설계도
	 * 객체란? 설계도를 통해 만든 것
	 * 
	 * 객체는 힙메모리에 저장!
	 * 
	 * 객체를 만드는 방법 : 생성자 호출 or new생성자();
	 * <객체(변수) 다루기>
	 * 객체의 변수에 접근하기
	 * 객체의 메소드 호출하기
	 * 
	 * 생성자란?
	 * 객체를 생성해줌 or 접근제한자 클래스명(){} 
	 * 왜써?
	 * 객체생성-(이중간에 해야할일)-객체리턴
	 * 객체가 생성되는 순간에 작업할게 있을 때
	 * 
	 * 접근제한자
	 * 객체멤버의 공개 범위 설정
	 * 필드에 대해서 private로설정!
	 * 
	 * 멤버가 뭔지?
	 * 객체안에 들어있는것(변수,메소드)
	 * 
	 * 
	 * getter/setter
	 * 필드에 대해 private로 설정함에 따라
	 * 메소드를 사용하여 가져오거나 넣어줌
	 * 
	 * */

}
