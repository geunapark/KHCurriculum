package sec06;
class Circle{
	double radius;
	String color;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Circle(double radius,String color) {
		this.radius=radius;
		this.color=color;
	}
	public Circle(double radius) {
		this(radius,"파랑");
	}
	public Circle(String color) {
		this(10.0,color);
	}
	public Circle() {
		this(10.0,"빨강");

	}
	public void show() {
		System.out.printf("%s 색깔의 반지름 : %.1f\n",this.color,this.radius);
	}
}


public class CircleDemo {

	public static void main(String[] args) {
		Circle c1=new Circle(10.0,"빨강");
		c1.show();
		Circle c2=new Circle(10.0);
		c2.show();
		Circle c3=new Circle("빨강");
		c3.show();
		Circle c4=new Circle();
		c4.show();
		Circle c5=new Circle();
	}

}
