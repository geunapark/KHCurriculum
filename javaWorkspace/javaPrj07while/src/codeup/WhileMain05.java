package codeup;

public class WhileMain05 {

	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%7==0) {
				System.out.println("lucky");
			}else {
				System.out.println(i);
			}
			i++;
		}
	}

}
