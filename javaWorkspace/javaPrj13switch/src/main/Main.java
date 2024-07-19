package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//switch
		System.out.println("=====제어문(조건문 - switch) ======");
		
		//?월이 몇일까지 있는지 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : System.out.println("31");break;
		case 4 : 
		case 6 :
		case 9 : 
		case 11 : System.out.println("30");
		break;
		case 2 : System.out.println("28");
		break;
		default : System.out.println("그런 월은 없습니다. 1~12 중 입력하세요");
		}
		
		
	}

}
