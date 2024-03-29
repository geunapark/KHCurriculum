package test;

public class Animal {
	private String name;
	private int age;
	public Animal() {
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	public void eat() {
		System.out.println(this.name+"가 먹는다.");
	}
	public void cry() {
		System.out.println(this.name+"가 운다.");
	}
	
	

}
