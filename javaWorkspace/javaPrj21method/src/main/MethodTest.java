package main;

public class MethodTest {
	// argument return
	// 지역변수 local
	/*
	 * ※메소드명은 변수와 동일하게 camelCase로 지어주기!
	 * 	또한 메소드 이름은 실행할 내용을 알수있게 써야함!
	 * [문법]
	 * 접급제한자 리턴타입 메소드명(매개변수){
	 * 	실행내용 ~~~
	 *  return ???; 
	 * }
	 * 
	 * public int plus(int a, int b){
	 * 	int result=a+b;
	 * 	return result;
	 * }
	 * 
	 * 인자값에 맞게
	 * 타입, 갯수, 순서 맞게 사용하여야함!
	 * 
	 * 
	 * */
	
	
	
	
	// 인자값X 반환값X
	public void m01() {
		System.out.println("복잡한 잡업111 ~~~");
		System.out.println("복잡한 잡업222 ~~~");
		System.out.println("복잡한 잡업333 ~~~");
		System.out.println("복잡한 잡업444 ~~~");
		System.out.println("복잡한 잡업555 ~~~");
	}
	
	// 인자값O 반환값X
	public void m02(int a,int b,String c) {
		int x=a;
		int y=b;
		int sum = x+y;
		System.out.println("나이 : "+sum);
		System.out.println("이름 : "+c);
	}
	
	// 인자값X 반환값O
	public int m03() {
		int x=10;
		int y=20;
		return x+y;
	}
	
	// 인자값O 반환값O
	public int plus(int num1,int num2) {
		int a=num1;
		int b=num2;
		int result=a+b;
		return result;
	}
	
	
	
	

}
