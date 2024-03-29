package util;

import java.util.Scanner;

public class KhScanner {
	private static final Scanner sc=new Scanner(System.in);
	
	//입력받은 내용을 정수로 리턴하기
	public static int scanInt() {
		String str=sc.nextLine();
		int x=Integer.parseInt(str);
		return x;
		
	}
	
	//입력받은 내욜을 문자열 그대로 리턴하기
	public static String scanString() {
		String str=sc.nextLine();
		return str;
		
	}
	//입력받은 내욜을 불타입Boolean 그대로 리턴하기
	public static Boolean scanBoolean() {
		String str=sc.nextLine();
		if(str.equals("true")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//입력받은 내욜을 문자타입Char 그대로 리턴하기
	public static char scanChar() {
		String str=sc.nextLine();
		if(str.equals("R")) {
			return 'R';
		}else {
			return 'L';
		}
		
	}
	
}
