package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	int mp;
	String name;
	char suffix;
	Item[] items = new Item[2];
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
	}

	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void selectAction(Board board) {
		char ch = Util.choice("w:↑s:↓a:← d:→ i:情報 u:持ち物 l:見る > ");
		switch (ch) {
		case 'w', 's', 'a', 'd' -> {
			move(ch, board);
		}
		case 'i' -> {
			lookStatus();
		}
		case 'u' -> {
			lookInventory();
		}
		}
	}
	
	private void move(char ch, Board board) {
		switch (ch) {
		case 'w' -> {
			y = Math.max(y-1,  0);
		}
		case 's' -> {
			y = Math.min(y+1, board.ysize - 1);
		}
		case 'a' -> {
			x = Math.max(x-1, 0);
		}
		case 'd' -> {
			x = Math.min(x+1, board.xsize - 1);
		}
		}
	}
	
	private void lookStatus() {
		System.out.print("HP:" + this.hp + " MP:" + this.mp);
		for (Item i : items) {
			if (i != null)
				System.out.print(" " + i.name);
		}
		System.out.println();
	}
	
	
	private void lookInventory() {
		System.out.print(" 持ち物 ");
		for (int i = 0; i < items.length; i++) {
			System.out.print(" " + i + ":");
			if (items[i] == null)
				System.out.print("なし");
			else
				System.out.print(items[i]);
		}
		System.out.println(" 9:今はどれも使わない");
		char ch = Util.choice("どれを使いますか？ > ");
		useItem(ch);
	}
	
	private void useItem(char ch) {
		switch (ch) {
		case '0' -> {
			System.out.println(this.name + "は" + items[ch - '0'].name + "を使った");
			if (items[0] instanceof Potion p) {
				this.hp = Math.min(this.hp + p.recovHp, 100);
				System.out.println(this.name + "のHPが" + this.hp + "になった");
				items[0] = null;
			}
		}
		case '1' -> {
			System.out.println(this.name + "は" + items[ch - '0'].name + "を使った");
			if (items[1] instanceof Ether e) {
				this.mp = Math.min(this.mp + e.recovMp, 50);
				System.out.println(this.name + "のMPが" + this.mp + "になった");
				items[1] = null;
			}
		}
		case '9' -> {
			System.out.println("今はどれも使わない");
		}
		}
	}
	
	public void attack(Monster m) {
		if (this.hp <= 0) return;
		System.out.println("\n" + this.name + "は" + m.name + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた");
		
	}
	
	/**
	 * itemsは配列なので、サイズを変更できない。
	 * @param i
	 *   items[0] ポーション
	 *   items[1] エーテル
	 */
	public void take(Item i) {
		System.out.println(this.name + "は" + i.name + "を拾い上げた");
		if (i instanceof Potion p) {
			this.items[0] = p;
		} else if (i instanceof Ether e) {
			this.items[1] = e;
		}
		
	}
}
