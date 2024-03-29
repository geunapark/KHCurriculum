package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 무족건 한번은 실행!
		int x=100;
		do {
			System.out.println("hello world!");
			x++;
		}while(x<5);
		/*
		for(int i=0;i<5;i++ ) {
			
			if(i==3) {
				continue;
			}
			System.out.println("hello");
		}*/
		
		int a=0;
		int b=0;
		
		int n;
		
		int i,j;
		int star;
	
        
        for (i=0;i<5;i+=2) {
        	for(j=5;j>=i;j-=2) {
        		System.out.print(" ");
        	}
        	for(star=0;star<=i;star++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        for (i =0;i<=5-2;i+=2) {   
            System.out.print(" ");
            for (j=0;j<=i;j+=2) {  
                System.out.print(" ");
            }
            for (star=5-2;star>i;star--) { 
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
