package main;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Movie;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		//Movie[] moArr = new Movie[3];
		
		//Movie mo01 = new Movie("파묘" , 19);
		//Movie mo02 = new Movie("해리포터" , 15);
		//Movie mo03  = new Movie("반지의 제왕" , 0);
		
		ArrayList list = new ArrayList();
		list.add(new Movie("파묘" , 19));
		list.add(new Movie("해리포터" , 15));
		list.add(new Movie("반지의 제왕" , 0));
		
		
		for (Object x : list) {
			System.out.println(x);
		}
		
	}

}
