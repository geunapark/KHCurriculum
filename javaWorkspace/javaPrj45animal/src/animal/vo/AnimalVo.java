package animal.vo;

public abstract class AnimalVo {
	
	private String name;
	private String lifeSpan;
	private String habitat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public abstract void cry();
	
}
