package main;

public class Ether extends Item {
	int recovMp = 50;

	public Ether(String name, char suffix) {
		super(name, suffix);
	}
	public Ether() {
		this("エーテル", 'e');
	}
}
