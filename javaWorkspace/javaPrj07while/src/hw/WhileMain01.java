package hw;
import java.util.Scanner;
public class WhileMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 0;
		while(i<=x) {
			System.out.println(i);
			i = i + 1;
		}
		
	}

}
