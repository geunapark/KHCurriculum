package sec03;

class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value+"만 원짜리 "+model+" 스마트폰");
	}
}


public class PhoneDemo {

	public static void main(String[] args) {
		Phone mp=new Phone();
		mp.model="갤럭시 S8";
		mp.value=100;
		mp.print();
		
		Phone yp=new Phone();
		yp.model="G6";
		yp.value=85;
		yp.print();
	}

}
