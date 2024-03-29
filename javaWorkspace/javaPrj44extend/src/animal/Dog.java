package animal;

public class Dog extends Animal{
	
	public String name="몬드";
	public int age=3;
	
	public Dog() {
		super("zzz",10);
		// TODO Auto-generated constructor stub
	}

	public void introduce() {
		//this 현재
		//super 부모
		System.out.println("제 이름은 "+this.name+" 입니다.");
		System.out.println("제 이름은 "+super.name+" 입니다.");
	}
	
	//이 메소드는 부모한테 있는거 덮어쓰기 한거임
	//annotation
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	
}
