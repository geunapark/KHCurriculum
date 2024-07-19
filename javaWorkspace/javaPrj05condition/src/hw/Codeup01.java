package hw;

public class Codeup01 {

	public static void main(String[] args) {
		//오름차순...
		int x = 10;
		int y = 10;
		int z = 10;

		if (x > y && x > z) {
			if (y > z) {
				System.out.println("x y z : " + x + y + z);
			} else {
				System.out.println("x z y : " + x + z + y);
			}
		}
		if(y>x && y>z) {
			if (x > z) {
				System.out.println("y x z : " + y + x + z);
			} else {
				System.out.println("y z x : " + y + z + x);
			}
		}
		if(z>x && z>y) {
			if (y > x) {
				System.out.println("z y x : " + z + y + x);
			} else {
				System.out.println("z x y : " + z + x + y);
			}
		}
		
		
		
		if(x==y&& x==z) {
			if(y==z) {
				System.out.println("세 숫자 모두 같은 수 입니다.");
			}
			
		}

	}

}
