package main;

public class Potion extends Item {
	int recovHp = 100;

	public Potion(String name, char suffix) {
		super(name, suffix);
	}
	public Potion() {
		this("ポーション", 'p');
	}
}
