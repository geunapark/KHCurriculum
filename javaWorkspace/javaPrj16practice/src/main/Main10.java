package main;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        //1 이랑 음수는 소수가 아님
        //소수는 n은 1또는 n으로만 나눠짐
        //따라서 cnt가 2초과라면 소수가 아님
//        3,5,9,11...
//        1..3 1..5
//        12345
        
        
        if (x < 2) {
            System.out.print("음수 또는 1은 소수가 아닙니다.");
            return;
        }

        
        int cnt = 0;// 2가 나와야 소수 2초과 소수가 아니다.
        // int i 1~n까지 반복 n%i==0 
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cnt++;
            }
        }
        if (cnt > 2) {
            System.out.print("소수가 아닙니다.");
        } else {
            System.out.print("소수입니다.");
        }
        
        /*cnt 없이 할수 있는 소수 체크코드
        boolean isPrime=true// 1:소수 2:소수아님
        if (num==1){
        	isPrime=false;
        }
        for(int i=2;i<x;i++) {
        	if(x%i==0) {
        		System.out.println("소수가 아닙니다.");
        		isPrime=false;
        		break;
        	}
        	
        }
        if(isPrime){
        	System.out.println("소수 입니다.");
        }
        */
        
        
		
		/*실수 확인 코드 잘못 인지
		double x=sc.nextDouble();
		double a=x-(int)x;
		if(a==0) {
			System.out.println("실수가 아닙니다.");
		}else {
			System.out.println("실수입니다.");
		}
		*/
	}

}
