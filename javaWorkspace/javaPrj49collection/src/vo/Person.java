package vo;

public class Person {

	
	public Person() {
	}

	public Person(String name, int age, double hi, double wg) {
		super();
		this.name = name;
		this.age = age;
		this.hi = hi;
		this.wg = wg;
	}

	private String name;
	private int age;
	private double hi;
	private double wg;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHi() {
		return hi;
	}


	public void setHi(double hi) {
		this.hi = hi;
	}


	public double getWg() {
		return wg;
	}


	public void setWg(double wg) {
		this.wg = wg;
	}



	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hi=" + hi + ", wg=" + wg + "]";
	}
}
