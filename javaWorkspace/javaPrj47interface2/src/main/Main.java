package main;

import car.CarAction;
import car.CarActionElec;
import car.Gbagan;
import car.Tesla;

public class Main {

	public static void main(String[] args) {
		
	// Tesla tesla = new Tesla(); 이거로도 가능
	//CarActionElec tesla = new Tesla();
		CarAction x = new Tesla();
		
		((CarActionElec)x).goElec(); //type casting
	}

}
