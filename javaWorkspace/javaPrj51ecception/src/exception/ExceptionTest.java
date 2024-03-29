package exception;

import java.util.Scanner;

public class ExceptionTest {

	public void method01() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("a : ");
			int x = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
			int result = x / b;

			System.out.println(result);
//			System.out.println("try 블럭 진입~");
//			String str = null;
//			System.out.println("str 변수에 null을 할당함~~~");
//			int x =10/0;
//			System.out.println("변수 x에 어떤 값을 넣음");
//			str.charAt(x);
//			System.out.println("str에 접근해서 x의 인덱스의 문자를 가져옴~~");

//		}catch (NullPointerException x) {
//			System.out.println("NPE 에러발생");
//		}catch(ArithmeticException x) {
//			System.out.println("AE 예외발생");
//		}catch(ArrayIndexOutOfBoundsException x) {
//			System.out.println("AIOOBE 예외발생");
		} catch (RuntimeException x) {
			System.out.println("런타임 예외 발생!!!");
		}

	}

	public void method02() {
		System.out.println("02 Start");

		try {
			method03();
		} catch (Exception e) {
			System.out.println("method03 실행 중 예외가 발생");
		}
		System.out.println("02 Finish");
	}

	public void method03() throws Exception {
		System.out.println("03 Start");
		int x = 10 / 0;
		System.out.println("03 Finish");
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
		
		System.out.println(name + "("+ age + "세) 님 반갑습니다");
	}
}
