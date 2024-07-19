package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Filesave {

	public void server() {

		int port = 3000;

		ServerSocket server;

		try {

			server = new ServerSocket(port);

			while (true) {

				Socket client = server.accept();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
