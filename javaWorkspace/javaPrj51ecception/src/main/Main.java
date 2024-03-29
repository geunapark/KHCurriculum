package main;

import exception.ExceptionTest;
import practice.MemberController;

public class Main {

	public static void main(String[] args){

		
		
		System.out.println("----- exception -----");
		
		
		MemberController mc = new MemberController();
		
		try {
			mc.join();
		}catch(Exception e) {
			System.out.println("회원가입 실패,,,");
			System.out.println(e.getMessage());
		}
	}

}
