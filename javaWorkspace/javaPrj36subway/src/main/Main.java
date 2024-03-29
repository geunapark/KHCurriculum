package main;

import subway.SubwaySystem;

public class Main {
	
	

	public static void main(String[] args) {
		System.out.println("===== 지하철 =====");
		
		
		SubwaySystem ss=new SubwaySystem();
		
		boolean isFinish=false;
		
		while(!isFinish) {			
			isFinish=ss.showMenu();
		}
		
		
	}

}
