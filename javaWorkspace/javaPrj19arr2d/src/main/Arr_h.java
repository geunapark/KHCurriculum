package main;

import java.util.Scanner;

public class Arr_h {

	public static void main(String[] args) {
		//배열 생성	//타입[] 변수명=배열덩어리[칸갯수];
		int[] a=new int[3];
		
		//배열의 특정 칸에 접근 (값 넣기)
		//인덱스 사용하면 됨//0번부터 시작 주의//범위 주의
		a[1]=10;	//[][10][]
		
		
		//배열의 특정 칸에 접근 (값 꺼내기)
		int result=a[1];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("x정수 입력 : ");
		int x=sc.nextInt();
		System.out.print("y정수 입력 : ");
		int y=sc.nextInt();
		int cnt=0;
		int z=0;
	
		for(int i=x;i<=y;i++) {
			if(i%5==0) {
				cnt++;
			}
		}
		
//		System.out.println(cnt);
		
		int[] arr=new int[cnt];
		
		
		for(int i=x;i<=y;i++) {
			if(i%5==0) {
				arr[z]=i;
				z++;
			}
			
		}
		System.out.println("arr["+cnt+"]");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
