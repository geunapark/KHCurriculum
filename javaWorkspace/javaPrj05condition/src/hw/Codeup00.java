package hw;

public class Codeup00 {

	public static void main(String[] args) {
		
		int x = 1999;
		
		if(x % 400 == 0 || x % 4 ==0 && x % 100 != 0 ) {
			System.out.println("Leap");
		}			
		else {
			System.out.println("Nomal");
		}
		
	}

}
