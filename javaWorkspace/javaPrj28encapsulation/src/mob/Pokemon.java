package mob;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public void setAtk(int atk) {
		this.atk=atk;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
	
	public void showView() {
		System.out.printf("이룸 : %s \n체력 : %d \n공격력 : %d\n",this.name,this.hp,this.atk);
	}
	
	
	public void bodyAttack() {
		System.out.println(this.name+"의 몸통 박치기 !!!");
	}

}
