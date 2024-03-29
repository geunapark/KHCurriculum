package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		
		System.out.println("===== 로또 =====");
		System.out.println("몇장 구매 하시겠습니까?");
		
		int n=sc.nextInt();
		System.out.println(n+"장 구매");
		
		int myNum[][]=new int[n][6];
		
		for(int i=0;i<myNum.length;i++) {
			System.out.println((i+1)+"번째 수동(1번) 자동(2번)");
			int manualAuto=sc.nextInt();
			if(manualAuto>2||manualAuto<=0) {
				System.out.println("잘못 입력하셨습니다. 다시 구매해주세요");
				return;
			}
			for(int j=0;j<myNum[i].length;j++) {
				if(manualAuto==1) {
					System.out.print((j+1)+"번째 숫자를 입력하세요 : ");
					myNum[i][j]=sc.nextInt();
					if(myNum[i][j]>45||myNum[i][j]<=0) {
						System.out.println("1~45사이의 숫자를 입력해주셔야 합니다. 다시 구매해주세요.");
						return;
					}else {
						for(int p=0;p<j;p++) {
							if(myNum[i][j]==myNum[i][p]) {
								System.out.println("동일한 숫자는 입력할수 없습니다. 다시 구매해 주세요.");
								return;
							}
						}
					}
				}else {
					myNum[i][j]=rd.nextInt(45)+1;
					for(int p=0;p<j;p++) {
						if(myNum[i][j]==myNum[i][p]) {
							j--;
						}
					}
				}
			}
		}
		
		
		
		
		for(int i=0;i<myNum.length;i++) {
			System.out.print((i+1)+"번째 로또 번호 : ");
			for(int j=0;j<myNum[i].length;j++) {
				System.out.print("["+myNum[i][j]+"]");
			}
			System.out.println();
		}
		
		
		
		System.out.println("로또 추첨");
		
		int lotte[]=new int[7];
		
		for(int i=0;i<lotte.length;i++) {
			lotte[i]=rd.nextInt(45)+1;
			for(int p=0;p<i;p++) {
				if(lotte[i]==lotte[p]) {
					i--;
				}
			}
		}
		
		
		System.out.print("이번주 로또 번호 : ");
		for(int i=0;i<lotte.length;i++) {
			if(i==6) {
				System.out.print("\t행운의 번호 : "+"["+lotte[i]+"]");
			}else {
				System.out.print("["+lotte[i]+"]");
			}
		}
		
		
		int cnt[]=new int[n];
		int lucky[]=new int[n];
		
		for(int i=0;i<myNum.length;i++) {
			cnt[i]=0;
			lucky[i] = 0;
		}
		
		for(int i=0;i<myNum.length;i++) {
			for(int j=0;j<myNum[i].length;j++) {
				for(int z=0;z<myNum[i].length;z++) {
					if(myNum[i][j]==lotte[z]) {
						cnt[i]++;
					}
				}
				
				if(lotte[6]==myNum[i][j]) {
					lucky[i]++;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<myNum.length;i++) {
			System.out.print((i+1)+"번 째 맞은횟수 : "+cnt[i]);
			System.out.println(" 행운번호 : "+lucky[i]);
		}
		
		
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==6) {
				System.out.println((i+1)+"번째 1등입니다.");
			}else if(cnt[i]==5&&lucky[i]==1) {
				System.out.println((i+1)+"번째 2등입니다.");
			}else if(cnt[i]==5) {
				System.out.println((i+1)+"번째 3등입니다.");
			}else if(cnt[i]==4) {
				System.out.println((i+1)+"번째 4등입니다.");
			}else if(cnt[i]==3) {
				System.out.println((i+1)+"번째 5둥입니다.");
			}else {
				System.out.println((i+1)+"번째 꽝입니다.");
			}
		}
		
		
		
		
		
		
	}

}
