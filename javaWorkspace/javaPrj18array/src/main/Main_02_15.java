package main;

public class Main_02_15 {

	public static void main(String[] args) {
//		int [] arr= new int[3];
//		ㅁ ㅁ ㅁ 4바이트 3칸공간 생성
//		arr 라는 변수에 대입
//		arr란 참조(ref)형변수
//		참조형이란? 주소값이 들어간다.
		try {
			int[] arr=new int[3];
			arr[5]=3;
			System.out.println(arr[0]);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
