package list.list3;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String toString() {
		return name + ":" + hp;
	}
}
