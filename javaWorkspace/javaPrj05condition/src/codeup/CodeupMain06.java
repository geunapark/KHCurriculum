package codeup;

import java.util.ArrayList;
import java.util.Random;

public class CodeupMain06 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] lotte=new int[7];
		int[] my=new int[6];
		
		int count=0;
		int lucky=0;
		
		
		System.out.print("이번주 로또 번호 : ");
		for(int i=0;i<7;i++) {
            lotte[i]=rd.nextInt(45)+1;
            System.out.print(lotte[i]+"   ");
            
        }
		System.out.println();
		
		System.out.print("나의 로또 번호 : ");
		for(int i=0;i<6;i++) {
            my[i]=rd.nextInt(45)+1;
            System.out.print(my[i]+"   ");
        }
		
		
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotte[i]==my[j]) {
					count += 1;
				}
			}
		}
		
		for (int i=0;i<6;i++) {
			if(lotte[6]==my[i]) {
				lucky +=1;
			}
		}
		
		System.out.println();
		System.out.println("겹치는 수 : "+count+" 행운번호 : "+lucky);
		
		if(count==6) {
			System.out.println("1등");
		}else if(count==5&&lucky==1) {
			System.out.println("2등");
		}else if(count==5) {
			System.out.println("3등");
		}else if (count==4) {
			System.out.println("4등");
		}else if (count==3) {
			System.out.println("5등");
		}else {
			System.out.println("꽝");
		}
		
		
		
        
        
	}

}
