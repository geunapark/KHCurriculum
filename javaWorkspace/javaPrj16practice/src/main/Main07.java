package main;
import java.util.Scanner;
public class Main07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n을 입력하시오 > ");
		int n = sc.nextInt();
		
		for(int i = 0;i <n;i++) {
			System.out.print("*");
		}
		
	}

}
