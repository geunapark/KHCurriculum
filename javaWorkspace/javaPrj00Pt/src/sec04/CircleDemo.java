package sec04;

class Circle{
	double radius;
	
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x,double y) {
		System.out.printf("반지름 = %.1f, 넓이=%.1f\n",x,y);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle mc=new Circle();
		
		mc.radius=10.0;
		mc.show(mc.radius, mc.findArea());
	}

}
