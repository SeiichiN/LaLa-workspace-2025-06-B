package list.list4;

public class Ether extends Item {
	private int mp;
	
	public Ether(String name) {
		super(name);
		this.mp = 50;
	}
	public String toString() {
		return getName() + " MP:" + mp;
	}
	public int getMp() {
		return mp;
	}
}
