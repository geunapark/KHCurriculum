package car;

public class Tesla implements CarActionElec {

	@Override
	public void goElec() {
		System.out.println("테슬라 ㄱㄱㄱ");
	}

	@Override
	public void stop() {
		System.out.println("테슬라 멈춤");
	}

}
