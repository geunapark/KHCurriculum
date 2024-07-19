package main;

import java.net.InetAddress;
import java.net.Socket;

public class Circle {

	public void client() {
		int port = 3000;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(serverIP,port);
		}
	}
}
