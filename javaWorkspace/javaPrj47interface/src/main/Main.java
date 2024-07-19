package main;

import car.Tesla;
import car.CarAction;
import car.CarActionElec;

public class Main {

	public static void main(String[] args) {

		CarAction x = new Tesla();
		
		((CarActionElec)x).goElec();

		
//		if( tesla instanceof Tesla) {
//			System.out.println("통과");
//		}else {
//			System.out.println("실패");
//		}
	}

}
