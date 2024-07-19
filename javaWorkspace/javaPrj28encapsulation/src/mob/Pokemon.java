package mob;

public class Pokemon {
	
	private String name;
	private int hp;
	private int atk;
	
	public void setName(String name) { //이름 중복되도 상관없음. 스코프??가 다름.
		this.name = name;
	}
	
	public void setHp(int hp) { //이름 중복되도 상관없음. 스코프??가 다름.
		this.hp = hp;
	}
	
	public void setAtk(int atk) { //이름 중복되도 상관없음. 스코프??가 다름.
		this.atk = atk;
	}
	
			
			
	
	public void bodyAttack() {
		System.out.println(name + "의 몸통 박치기!!!");
	}//bodyAttack
	
	
}
