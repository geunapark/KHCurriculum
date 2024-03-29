package car;

public class Gbagan implements CarActionGasoline {


	@Override
	public void goGosoline() {
		System.out.println("지바겐 기름으로 변경!!!");
	}

	@Override
	public void stop() {
		System.out.println("지바겐 정지!!!");
	}
 
	
	
}
