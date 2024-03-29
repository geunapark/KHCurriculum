package main;

public class Pokemon{
	
	//변수 데이터
//	이름, 레벨, 체력, 공격력, 경험치, 타입, 마나
	String name;
	int hp;
	int atk;
	
	public void test(String name,int hp,int atk) {
		this.name=name;
		hp=hp;
		atk=atk;
	}
	
	//메소드 변수
	public void print() {
		System.out.println(name);
		System.out.println(hp);
		System.out.println(atk);
	}
	
//	스킬, 피하기, 쓰러지기, 공격하기
	public void bodyAttack() {
		//this는 현재 변수
		
		System.out.println(this.name+"의 몸통 박치기");
	}

}
