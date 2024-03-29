package main;

public class Pokemon {
	String name;
	int hp;
	int apk;
	int def;
	
	public Pokemon(String name,int hp,int apk,int def) {
		this.name=name;
		this.hp=hp;
		this.apk=apk;
		this.def=def;
		
	}
	public void bodyAttack() {
		System.out.println(this.name+"의 몸통 박치기!!!");
	}

}
