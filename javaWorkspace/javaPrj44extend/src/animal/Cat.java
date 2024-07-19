package animal;

public class Cat extends Animal{
	
	public Cat() {
		super("코코", 8);
	}

	@Override
	public void cry() {
		System.out.println("야옹 ");
	}
	
}
