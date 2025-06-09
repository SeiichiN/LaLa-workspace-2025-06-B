package main;

import java.util.Random;

public abstract class Character {
	private int y;
	private int x;
	private int hp;
	private String name;
	private char suffix;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
	}

	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.getYsize());
		this.x = new Random().nextInt(board.getXsize());
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "は" + m.getName() + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.setHp(m.getHp() - damage);
		System.out.println(m.getName() + "に" + damage + "ポイントのダメージを与えた");
		
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public char getSuffix() {
		return suffix;
	}
}
