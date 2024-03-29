package main;

import java.io.BufferedReader;
import java.io.IOException;

public class ServerMsgReader extends Thread implements Runnable {
	
	private BufferedReader br;
	
	public ServerMsgReader(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				String msg = br.readLine();
				System.out.println("어떤 클라이언트로부터 받은 메세지 : " + msg);
				ServerMain.MSG_QUEUE.add(msg);
				
			} catch (IOException e) {
				System.out.println("메세지 읽다가 에러발생...");
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("쓰레드 자는데 방해한듯,,");
			}
			
		}//while
		
	}//run

}//class
