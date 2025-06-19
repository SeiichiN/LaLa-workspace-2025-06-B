package main;

import java.util.Random;

public class Wizard extends Character {

	public Wizard(String name, char suffix) {
		super(name, suffix);
	}
	public Wizard() {
		this("魔法使い", '$');
	}
	
	@Override
	public void attack(Monster m) {
		int n = new Random().nextInt(99);
		if (n % 2 == 1) {
			fireball(m);
		} else {
			super.attack(m);
		}
		
	}
	
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		int damage = new Random().nextInt(40);
		m.hp -= damage;
		this.mp -= 10;
		System.out.println(this.name + "はMPを10使った");
	}

}
