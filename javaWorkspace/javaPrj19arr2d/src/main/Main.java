package main;
public class Main {
	public static void main(String[] args) {
		
		//배열 생성 // 타입[] 변수명 = 배열 덩어리[칸갯수];
		int[] a = new int[3];
		
		//배열의 특정 칸에 접근 (값 넣기) 
		//칸번호(인덱스) 사용하면 됨 //0번부터 시작 주의 // 범위 주의
		a[0] = 3;
		a[1] = 10;
		a[2] = 4;
		
		//배열의 특정 칸에 접근 (값 꺼내기)
		int result = a[1];  //접근!!!
		System.out.println(a[1]);
	}
}