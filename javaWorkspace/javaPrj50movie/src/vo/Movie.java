package vo;

public class Movie {

	public Movie() {
	}

	public Movie(String name, int ageLimit) {
		this.name = name;
		this.ageLimit = ageLimit;
	}

	private String name;
	private int ageLimit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", ageLimit=" + ageLimit + "]";
	}

}
