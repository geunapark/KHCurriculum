package main;

public class Pokemon {
	
	public Pokemon(String name,int hp,int apk) {
		this.name=name;
		this.hp=hp;
		this.apk=apk;
	}
	
	String name;
	int hp;
	int apk;
	
	public void bodyAttack() {
		
		System.out.println(this.name+" 몸통 박치기 ~ !");
		
	}

}
