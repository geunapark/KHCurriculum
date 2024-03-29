package util;

import java.util.Scanner;

public class Input {
	public static final Scanner sc=new Scanner(System.in);
	//문자열 받기
	public static String scanString() {
		String str=sc.nextLine();
		return str;
	}
	
	//정수 받기
	public static int scanInt() {
		String str=sc.nextLine();
		int x=Integer.parseInt(str);
		return x;
	}
	

}
