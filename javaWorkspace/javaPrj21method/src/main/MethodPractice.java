package main;

public class MethodPractice {
	
	public void printHello() {
		System.out.println("Hello World");
	}
	
	public void sayHi() {
		System.out.println("Hi");
	}
	
	public void judgeNumber() {
		int x=10;
		if(x>0) {
			System.out.println("양수");
		}else if(x<0){
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
	}
	
	public void printNumbers() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	public void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public void plus(int x,int y) {
		System.out.println((x+y));
	}
	
	public int plusNumbers(int x,int y) {	
		return x+y;
	}
	
	
	
}
