package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[24];

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[num] = 1;
		}
		for(int i = 1; i <= 23; i++ ) {
			if(arr[i] == 1) {
				System.out.println(i);
				break;
			}
				
		}
	}
}