package main;

import java.util.Random;

public abstract class Monster extends GameObject {
	private int hp;
	private int attackP;  // 最大攻撃値

	public Monster(String name, char suffix) {
		super(name, suffix);
		this.hp = 100;
		this.attackP = 30;
	}
	
	public void attack(Character c) {
		System.out.println(this.getName() + "の攻撃！");
		int damage = new Random().nextInt(attackP);
		c.setHp(c.getHp() - damage);
		System.out.print(c.getName() + "に");
		System.out.println(damage + "ポイントのダメージを与えた！");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackP() {
		return attackP;
	}
}
