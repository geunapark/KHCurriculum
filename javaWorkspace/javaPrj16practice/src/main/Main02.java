package main;
import java.util.Scanner;
public class Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 > ");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
	}

}
