package exception;

import java.util.Scanner;

public class ExceptionTest {

	public void method01() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("a : ");
			int a = sc.nextInt();
			System.out.println("b : ");
			int b = sc.nextInt();
			int result = a / b;
			System.out.println(result);
		} catch (Exception x) {
			System.out.println(" 런타임 예외가 발생!!!");
		}
	}

	public void method02() {
		System.out.println("02 start...");
		try {
			method03();
		} catch (Exception e) {
			System.out.println("method03 실행 중 예외 발생. ");
		}
		System.out.println("02 finish...");
	}

	public void method03() throws Exception {
		System.out.println("03 start...");
		int x = 10 / 0;
		System.out.println("03 finish...");
	}

	public void method04() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		if(age<0) {
			throw new RuntimeException();
		}

		System.out.println(name + "(" + age + "세) 님 반갑습니다.");
	}
}
