package main;

import page.FirstPage;

public class Main {

	public static void main(String[] args) {
		FirstPage fp=new FirstPage();
		boolean isFinish=false;
		while(!isFinish) {
			isFinish = fp.start();
		}
	}

}