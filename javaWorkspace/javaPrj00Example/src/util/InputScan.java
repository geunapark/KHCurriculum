package util;

import java.util.Scanner;

public class InputScan {
	private static final Scanner SC=new Scanner(System.in);
	
	public int scanInt() {
		return Integer.parseInt(SC.nextLine());
	}
	
	public String scanString() {
		return SC.nextLine();
	}

}
