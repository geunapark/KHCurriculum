package main;
import java.util.Scanner;
public class Main05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이하의 자연수 n을 입력하시오 > ");
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <=x; i++) {
			sum = i +sum;
		}
		System.out.println(sum);
		
		
	}

}
