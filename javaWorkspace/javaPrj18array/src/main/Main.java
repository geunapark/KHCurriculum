package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("===== 배열 =====");
//		배열 : ※타입이 같은※ 변수 여러개 만드려고 씀
//		학생 성적 관리 (배열)
		
		
		//학생의 수 즉 배열의 크기를 지정
		System.out.print("학생의 수를 입력하세요 : ");
		int stdCnt=sc.nextInt();
		int[] score=new int[stdCnt];
		
		
		for(int i=0;i<score.length;i++) {
			System.out.print("학생 "+(i+1)+"의 점수를 입력해 주세요 : ");
			score[i]=sc.nextInt();
			
		}
		
		int sum=0;
		
		
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		} 
		
		
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/score.length);
		
		
		
//		학생 성적 관리 (변수)
//		System.out.print("1번 학생 성적 : ");
//		int score01=sc.nextInt();
//		System.out.print("2번 학생 성적 : ");
//		int score02=sc.nextInt();
//		System.out.print("3번 학생 성적 : ");
//		int score03=sc.nextInt();
//		System.out.print("4번 학생 성적 : ");
//		int score04=sc.nextInt();
//		System.out.print("5번 학생 성적 : ");
//		int score05=sc.nextInt();
//		
//		int sum=0;
//		
//		sum += score01;
//		sum += score02;
//		sum += score03;
//		sum += score04;
//		sum += score05;
//		
//		int stdCnt=5;
//		
//		System.out.println(sum);
//		System.out.println(sum/stdCnt);
//		
		
		
	}

}
