//package main;
//
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class ClientMsgSender extends Thread implements Runnable {
//	
//	private Scanner sc;
//	private PrintWriter pw;
//	
//	public ClientMsgSender(Scanner sc , PrintWriter pw) {
//		this.sc = sc;
//		this.pw = pw;
//	}
//	
//	@Override
//	public void run() {
//		while(true) {
//			// 유저한테 문자열 받기
//			System.out.print("[YOU] : ");
//			String msg = sc.nextLine();
//			
//			// 발신
//			pw.println(msg);
//			pw.flush();
//		}//while
//	}//run
//
//}//class
//
//
//
