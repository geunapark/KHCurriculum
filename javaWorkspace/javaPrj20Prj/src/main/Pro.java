package main;

import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double y=0;
		int age=0;
		
		if(b<=2) {
			y=a*0.0001;
			age=100-(int)y+13;
			
		}else {
			y=a*0.0001;
			age=13-(int)y;
		}
		
		System.out.println(age);
	}

}
