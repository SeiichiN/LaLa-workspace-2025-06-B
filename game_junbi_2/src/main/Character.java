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
	List<Item> items;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
		this.mp = 50;
		this.items = new ArrayList<>();
	}
	
	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void setPosition(Character c) {
		this.y = c.y;
		this.x = c.x;
	}
	
	public void selectAction(Board board) {
		char ch = Util.choice(this.name + " w:↑s:↓a:← d:→ i:情報 u:持ち物 l:見る > ");
		switch (ch) {
		case 'w', 's', 'a', 'd' -> {
			move(ch, board);
		}
		case 'i' -> {
			lookStatus();
		}
		case 'u' -> {
			lookItems();
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
	
	
	private void lookItems() {
		System.out.print(" 持ち物 ");
		for (int i = 0; i < items.size(); i++) {
			System.out.print(" " + i + ":");
			if (items.get(i) == null)
				System.out.print("なし");
			else
				System.out.print(items.get(i));
		}
		System.out.println(" 9:今はどれも使わない");
		char ch = Util.choice("どれを使いますか？ > ");
		useItem(ch);
	}
	
	private void useItem(char ch) {
		int num = ch - '0';
		System.out.println(this.name + "は" + items.get(num).name + "を使った");
		if (items.get(num) instanceof Potion p) {
			this.hp = Math.min(this.hp + p.recovHp, 100);
			System.out.println(this.name + "のHPが" + this.hp + "になった");
			items.remove(num);
		}
		else if (items.get(num) instanceof Ether e) {
			this.mp = Math.min(this.mp + e.recovMp, 50);
			System.out.println(this.name + "のMPが" + this.mp + "になった");
			items.remove(num);
		}
		else {
			System.out.println("今はどれも使わない");
		}
	}
	
	public void attack(Monster m) {
		if (this.hp <= 0) return;
		System.out.println("\n" + this.name + "は" + m.name + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた");
		
	}
	
	public boolean takeItem(Item i) {
		System.out.println(i.name + "が落ちていた");
		char ch = Util.choice("拾う？ y:拾う n:拾わない > ");
		if (ch == 'y') {
			System.out.println(this.name + "は" + i.name + "を拾い上げた");
			this.items.add(i);
			return true;
		}
		return false;
	}
}
