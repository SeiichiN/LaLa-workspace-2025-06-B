package main;

import java.util.Random;

public class Wizard extends Character {

	public Wizard(String name, char suffix) {
		super(name, suffix);
	}
	public Wizard() {
		this("魔法使い", '@');
	}
	
	@Override
	public void attack(Monster m) {
		int n = new Random().nextInt(99);
		int damage = 0;
		if (n % 2 == 1 && this.mp >= 10) {
			System.out.println(this.name + "は火の玉を放った！");
			damage = new Random().nextInt(40);
			this.mp -= 10;
		} else {
			System.out.println(this.name + "は魔法の呪文を唱えた！");
			damage = new Random().nextInt(10);
			this.mp -= 5;
		}
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "のダメージを与えた！");
	}

}
