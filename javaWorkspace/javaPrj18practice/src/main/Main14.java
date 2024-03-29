package main;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름 입력 하세요 ");
		String name=sc.nextLine();
		System.out.println("나이를 입력 하세요 ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("취미를 입력하세요 ");
		String hobby=sc.nextLine();
		
		System.out.println(name+age+hobby);
	}

}
