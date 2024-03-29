package practive;

public class Test {
	
	static int a=0;
	
	public void m01() {
		int [] arr= {10,20,30};
		m02(arr);
		System.out.println(arr[0]);
	}
	
	public void m02(int[] x) {
		
		System.out.println(x[0]);
		x[0]=100;
	}
	

	
}
