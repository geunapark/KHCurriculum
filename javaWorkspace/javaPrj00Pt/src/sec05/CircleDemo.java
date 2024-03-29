package sec05;

class Circle{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x,y);
	}
	
}


public class CircleDemo {

	public static void main(String[] args) {
		Circle mc=new Circle();
		
		mc.setRadius(10.0);
		mc.show(mc.getRadius(), mc.findArea());
	}

}
