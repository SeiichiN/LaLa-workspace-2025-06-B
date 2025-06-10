package code15_9;

public class Hero {
	String name;
	String job;
	int gold;
	
	public Hero(String name, String job, int gold) {
		this.name = name;
		this.job = job;
		this.gold = gold;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getGold() {
		return gold;
	}
	
}
