package hw;

public class WhileMain05 {

	public static void main(String[] args) {

		int x = 1;
		while (x < 100) {
			if (x % 7 == 0) {	
				System.out.println("lucky");
			}
			else {
				System.out.println(x);
			}
			x = x + 1;
			
		}

	}

}
