package main;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력 하세요");
		String a=sc.nextLine();
		System.out.println("b를 입력하세요");
		String b=sc.nextLine();
		if(a.equals(b)) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}                            
		
	}

}
