package sec07;

class Circle{
	double radius;
	static int numofCircles=0;
	int numCircles=0;
	
	public Circle(double radius) {
		this.radius=radius;
		numofCircles++;
		numCircles++;
	}
}


public class CircleDemo {

	public static void main(String[] args) {
		Circle mc=new Circle(10.0);
		Circle yc=new Circle(5.0);
		
		System.out.printf("원의 개수 : %d\n",Circle.numofCircles);
		System.out.printf("원의 개수 : %d\n",yc.numCircles);
	}

}
