package test;

public class Animal {
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	
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
	
	public void eat() {
		
	}
	public void cry() {
		
	}
	
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
