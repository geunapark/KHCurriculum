package main;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("===== 로또 =====");
		
		
		
		int [] lotte=new int[7];
		int [] my=new int[6];
		
		//랜덤값 입력받기
		for(int i=0;i<lotte.length;i++) {
			lotte[i]=rd.nextInt(45)+1;
		}
		//사용자 입력 받기
		for(int i=0;i<my.length;i++) {
			System.out.print(i+1+"번째 숫자 입력 : ");
			my[i]=sc.nextInt();
			if(my[i] > 45 || my[i]<=0) {
				System.out.println("잘못입력하셨습니다.");
				return;
			}
		}
		
		System.out.println("로또 추첨");
		//로또 출력
		for(int i=0;i<lotte.length;i++) {
			if(i==6) {
				System.out.print("행운의 번호 : "+lotte[i]+" ");
			}else {
				System.out.print(lotte[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<my.length;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		
		
		
		//출력및 맞은 횟수 카운트 해주기
		int cnt=0;
		int lucky=0;
		
		
		for(int i=0;i<my.length;i++) {
			for(int j=0;j<my.length;j++) {
				if(lotte[i]==my[j]) {
					cnt += 1;
				}
			}
		}
		
		for (int i=0;i<my.length;i++) {
			if(lotte[6]==my[i]) {
				lucky +=1;
			}
		}
		

		System.out.println("겹치는 수 : "+cnt+" 행운번호 : "+lucky);
		
		//조건문 을 사용해 등수 출력
		if(cnt==6) {
			System.out.println("1등입니다.");
		}else if(cnt==5&&lucky==1) {
			System.out.println("2등입니다.");
		}else if(cnt==5) {
			System.out.println("3등입니다.");
		}else if(cnt==4) {
			System.out.println("4등입니다.");
		}else if(cnt==3) {
			System.out.println("5둥입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		
	}

}
