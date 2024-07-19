package main;
import java.util.Scanner;
public class Main06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a,b 정수를 입력하시오 > ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i =a;i<=b;i++) {
			System.out.println(i);
		}
		
	}

}
