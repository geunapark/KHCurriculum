package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 다차원 배열 =====");
	
//		int[][] x=new int[3][];
//		
//		x[0]=new int[3];//			ㅁ ㅁ ㅁ
//		x[1]=new int[5];//			ㅁ ㅁ ㅁ ㅁ ㅁ
//		x[2]=new int[2];//			ㅁ ㅁ
//		
		
		int[] arr01=new int[3]; //arr01[주소값(x01)]	[][][]
		int[] arr02=new int[5];	//arr02[주소값(x02)]	[][][][][]
		int[] arr03=new int[2];	//arr03[주소값(x03)]	[][]
		
		int[][] x=new int[3][];//	x[주소값(x77)]		[][][]
		x[0]=arr01;//arr01->주소값x01 을 x[0]칸에 집에넣음
//					x[x77] ->   [x01][][]
		x[1]=arr02;//arr02->주소값x02 을 x[1]칸에 집에넣음
//					x[x77] ->   [x01][x02][]
		x[2]=arr03;//arr03->주소값x03 을 x[1]칸에 집에넣음
//					x[x77] ->   [x01][x02][x03]
		
//		System.out.println(x[1].length);
		
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
//		가변배열
//		2차원 배열이 테이블 형태라고 해서 반드시 가로 세로 똑같은 정방 행렬이 필요가 x
//		자바에서의 다차원 배열은 마지막 차수의 길이를 다르게 지정할 수 있기 때문에,
//		각요소로 들어가는 1차원 배열의 길이를 각기 다르게 해도
//		2차원 배열 데이터를 생성하는데 문제가 없다.
		int[][] arr= {
				{100,80,70},
				{60,50},
				{40,30,20,10,5},
				{4,3,2}
		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
