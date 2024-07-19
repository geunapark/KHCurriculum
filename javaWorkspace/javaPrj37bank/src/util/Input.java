package util;

import java.util.Scanner;

public class Input {
	
	private static final Scanner sc = new Scanner(System.in);
	
	// 문자열 받기
	public static String scanString() {
		String x = Input.sc.nextLine(); //sc 는 private 여서 다른 곳에서 못쓰기 때문에 따로 메서드를 넣은 거임.
		return x;
	}
	
	// 정수 받기
	public static int scanInt() {
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	
}
