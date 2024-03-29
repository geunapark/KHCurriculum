package main;

public class Main {

	public static void main(String[] args) {
		//<메소드> : 명령어 모아둠 
		//접근제한자 리턴타입 메소드명(매개변수){
		//	실행내용~~~~~
		//}
		
		//<생성자> : 객체 만드려고
		//접근제한자 클래스명(매개변수){
		//	객체생성(자동으로해줌)
		//	실행내용~~~~~
		//	객체리턴(자동으로해줌)
		//}
		
		//생성자 :  객체 생성함
		
		
		System.out.println(" ===== 생성자 ===== ");
		
//		new Person();
//		new Person(10);
		
		Pokemon p1=new Pokemon("강아지",100,30);
		p1.bodyAttack();
		
	}

}
