package main;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		int x[]= {20,10,30,50,40};
		
		Arrays.sort(x);

//		int temp=0;
//		for(int i=0;i<x.length;i++) {
//			for(int j=0;j<x.length;j++) {
//				if(x[i]>x[j]) {//x[0]20	x[1]10을비교 크다면?
//					temp=x[i];//temp에 x[0](20)을 저장
//					x[i]=x[j];//x[0](20)을 x[1](10)로 저장
//					x[j]=temp;//x[1]에 temp(20)저장
//					
//				}
//			}
//		}
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
//		Arrays.sort(x ,Collections.reverseOrder());
		
		
	}
	
}
