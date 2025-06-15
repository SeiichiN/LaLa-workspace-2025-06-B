package main;

public class Hero extends Character {

	public Hero(String name, char suffix) {
		super(name, suffix);
	}
	public Hero() {
		this("勇者", '@');
	}

}
