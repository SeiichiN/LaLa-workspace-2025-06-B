package main;

public class Item extends GameObject {

	public Item(String name, char suffix) {
		super(name, suffix);
	}
	public String toString() {
		if (this.name == null) {
			return "空";
		}
		return this.name;
	}

}
