package main;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public void method01() {
		int[] arr= {10,20,30};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void method02() {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 정수를 입력해 주세요 : ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public void method03() {
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[3];
		for(int i=0;i<arr.length;i++) {
			System.out.print("좋아하는 과일을 입력해 주세요 : ");
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void method04() {
		Scanner sc=new Scanner(System.in);
		int[] lotte=new int[6];

		
		for(int i=0;i<lotte.length;i++) {
			System.out.print((i+1)+"번째 숫자를 입력해 주세요 : ");
			lotte[i]=sc.nextInt();
			if(lotte[i]>45||lotte[i]<0) {
				System.out.println("잘못입력하셨음 ㅅㄱ");
				return;
			}
		}
		for(int i=0;i<lotte.length;i++) {
			System.out.println(lotte[i]);
		}
	}
	public void method05() {
		Scanner sc=new Scanner(System.in);
		int[] lotte=new int[45];
		Random rd=new Random();
		int[] com=new int[6];
		for(int i=0;i<com.length;i++) {
			com[i]=rd.nextInt(45)+1;
		}

		
		for(int i=0;i<lotte.length;i++) {
			
			lotte[i]=i+1;
			
		}
		for(int i=0;i<lotte.length;i++) {
			System.out.println(lotte[i]);
		}
		System.out.println("자동");
		for(int i=0;i<com.length;i++) {
			System.out.println(com[i]);
		}
	}
	public void method06() {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번째 숫자를 입력해 주세요");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
