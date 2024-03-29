package main;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
//		++x 전위 연산자
//		x++ 후위 연산자
		Scanner sc=new Scanner(System.in);
		System.out.println("자연수 n을 입력하세요");
		int n=sc.nextInt();
		int oddSum=0;
		int evenSum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				oddSum += i;
			}else if(i%2==0){
				evenSum += i;
			}
		}
		System.out.println("홀수 합 : "+oddSum);
		System.out.println("짝수 합 : "+evenSum);
	}

}
