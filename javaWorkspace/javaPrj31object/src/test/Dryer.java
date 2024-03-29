package test;

public class Dryer {
	
	boolean isActive=false;
	
	public void isturn() {
		System.out.println("킵니다.");
		isActive=true;
	}
	public void isOff() {
		System.out.println("종료합니다.");
		isActive=false;
	}
	

}
