package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//정수 1개 입력받고 양수인지 음수인지 판단 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 > ");
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.println("양수");
		}else if(x<0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}
		
	}

}
