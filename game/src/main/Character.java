package main;

import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	String name;
	char suffix;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
	}

	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "は" + m.name + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた");
		
	}
}
