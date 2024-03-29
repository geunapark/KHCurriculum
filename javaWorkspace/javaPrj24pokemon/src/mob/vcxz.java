package mob;

public class vcxz {
	public static void main(String[] args) {
		boolean a=false;
		int i=1;
		System.out.println((a==false));
		System.out.println();
		//while은 true일때 무한 반복문
		//!은 반대 따라서 !a는 true
		while (!a) {
			if(i>=5) {
				a=true;
				//a에 true값을 넣어지면 
				//!a는 반대즉 true에서  false로 되어서 반복문 종료
			}
			i++;
			System.out.println("gd");
			
		}
	}

}
