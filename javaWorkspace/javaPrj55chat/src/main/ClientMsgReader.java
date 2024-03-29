//package main;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//
//public class ClientMsgReader extends Thread implements Runnable {
//	
//	private BufferedReader br;
//	
//	public ClientMsgReader(BufferedReader br) {
//		this.br = br;
//	}
//	
//	@Override
//	public void run() {
//		while(true){
//			try {
//				String str = br.readLine();
//				System.out.println("[SERVER] " + str);
//			} catch (IOException e) {
//				System.out.println("에러 발생 ~~~");
//			}
//		}
//		
//	}//run
//
//}//class
//
//
