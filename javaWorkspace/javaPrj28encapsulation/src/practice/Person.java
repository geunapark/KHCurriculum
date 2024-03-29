package practice;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//메소드 가지고 getter, setter로 만들어 접근한다.
	//이름
	public void SetName(String name) {
		this.name=name;
	}
	public String  getName() {
		return this.name;
	}
	//나이
	public void SetAge(int age) {
		if(age <= 0) {
			System.out.println("나이에다가 음수값 넣으면 안됨...");
			return;
		}
		this.age=age;
	}
	public int  getAge() {
		return this.age;
	}
	//키
	public void SetHeight(double height) {
		this.height=height;
	}
	public double  getHeight() {
		return this.height;
	}
	//몸무게
	public void SetWeight(double Weight) {
		this.weight=Weight;
	}
	public double  getWeight() {
		return this.weight;
	}
	
	
	public void sayHello() {
		System.out.println("안녕하세요 저는 "+this.name+" 입니다.");
	}

}
