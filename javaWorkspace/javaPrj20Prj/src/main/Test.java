package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int busSit=30;
		int sum=0;
		System.out.print("기사님 종점의 정거장 수를 입력해 주세요 : ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("버스 이름을 입력해 주세요 : ");
		String name=sc.nextLine();
		System.out.println(name+"버스에 오신것을 환영합니다. 버스에 죄석은 30석 입니다.");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"번째 정거장 입니다.");
			System.out.print("승차 입원 입력하세요 : ");
			int sit=sc.nextInt();
			sum +=sit;
			
			
			if(sum>30) {
				System.out.println("자리 부족 죄송 ");
				break;
			}
			
			
			
			else {
				System.out.println(sum+"인원수 만큼 탔습니다.");
			}
			
			
			
			System.out.println("총"+sum+"인원 탔습니다.");
			System.out.print("하차 인원 입력 : ");
			int bye=sc.nextInt();
			sum -= bye;
			if(sum<0) {
				System.out.println("타있는 승객 보다 많습니다.");
				break;
			}else {
				System.out.println(sum+"인원 남았습니다.");
			}
	
		}
		System.out.println(name+"버스에 종점입니다. "+sum+"명은 이번역에서 무족건 내려주세요");
	}

}
