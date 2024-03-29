package animal;

public abstract class Animal {
	
	protected String name="애니멀";
	public int age=18;
	
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public abstract void cry();//추상메소드


	
}
