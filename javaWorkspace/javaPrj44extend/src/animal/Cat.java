package animal;

public class Cat extends Animal{
	
	public Cat(String a,int b) {
		super("zzz",10);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
