package hw;
import java.util.Scanner;
public class WhileMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int y = 0;
		while(y<=x) {
			System.out.println(y);
			y = y + 2;
		}
	}

}
