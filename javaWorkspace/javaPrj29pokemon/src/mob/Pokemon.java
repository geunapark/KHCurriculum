package mob;

public class Pokemon {
	
	public Pokemon(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	public void bodyAttack() {
		System.out.println(name + "의 몸통 박치기!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; //this 는 현재객체
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	
	
	
}
