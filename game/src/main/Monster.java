package main;

import java.util.Random;

public abstract class Monster extends GameObject {
	int hp;
	int attackP;  // 最大攻撃値

	public Monster(String name, char suffix) {
		super(name, suffix);
		this.hp = 100;
		this.attackP = 30;
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "の攻撃！");
		int damage = new Random().nextInt(attackP);
		c.hp -= damage;
		System.out.print(c.name + "に");
		System.out.println(damage + "ポイントのダメージを与えた！");
	}
}
