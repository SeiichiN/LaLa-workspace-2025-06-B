package list.list4;

public class Potion extends Item {
	private int hp;

	public Potion(String name) {
		super(name);
		this.hp = 100;
	}

	public String toString() {
		return getName() + " HP:" + hp;
	}

	public int getHp() {
		return hp;
	}
}
