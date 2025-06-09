package rensyu2;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	
	public int pray(int sec) {
		int recov = sec + new Random().nextInt(3);
		int oldMp = this.mp;
		this.mp += recov;
		if (this.mp > MAX_MP) {
			this.mp = MAX_MP;
		}
		return this.mp - oldMp;
	}
}
