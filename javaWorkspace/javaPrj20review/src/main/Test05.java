package main;

public class Test05 {

	public void method01() {

		// int형 변수 3개 만들고, //배열로 만들것
		// 10,20,30 데이터를 집어넣고,
		// 모든 데이터 출력

		int[] x = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

	}// method01

	public void method02() {
		// 문자열 배열 3칸 짜리 만들고
		// 좋아하는 과일 집어넣고
		// 모든 과일들을 출력해보기

		String[] f = new String[3];

		f[0] = "딸기";
		f[1] = "귤";
		f[2] = "딱딱한 복숭아";
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
	}// method02

	public void method03() {
		// 정수 6개를 담을 수 있는 배열 만들기
		// 로또 번호 6개 예상해서 넣어보기 (1~45)
		// 모든 번호 출력하기(반복문을 이용해서)

		int[] lo = new int[6];
		lo[0] = 23;
		lo[1] = 2;
		lo[2] = 45;
		lo[3] = 14;
		lo[4] = 7;
		lo[5] = 13;

		for (int i = 0; i < lo.length; i++) { // 6이 배열의 길이니까 length를 사용
			System.out.println(lo[i]);
		} // method03

	}// method03

	public void method04() {
		// 정수 45개를 담을 수 있는 배열 만들기
		// 로또 번호 45개 전부 넣기 (1~45)
		// 모든 번호 출력하기(반복문을 이용해서)
		
		int[] lo = new int[45];
		
		for(int i = 0;i<lo.length;i++) {
			lo[i] = i + 1;
			System.out.println(lo[i]);
		}
	}//method04
	
	public void method05() {
		
		int[] x = new int [5];
		x[0] = 111;
		x[1] = 222;
		x[2] = 333;
		x[3] = 444;
		x[4] = 555;
		
		for(int i = 0; i<x.length;++i) {
			System.out.println(x[i]);
		}
		
	}//method05
	

}
