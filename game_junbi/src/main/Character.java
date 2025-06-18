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
	List<Item> itemList;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
		this.mp = 50;
		this.itemList = new ArrayList<>();
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
	
	public void selectAction(Board board) {
		char ch = Util.choice("w↑ s↓ a← d→ u:使う i:情報 l:見る > ");
		switch (ch) {
		case 'u' -> {
			useItem();
		}
		case 'w','s','a','d' -> {
			move(ch, board);
		}
		case 'i' -> {
			printInfo();
		}
		}
		
	}
	
	
	private char selectItem() {
		if (itemList.size() == 0) {
			System.out.println("まだ何も持ってません");
			return ' ';
		}
		char ch = ' ';
		do {
			String str = "どれを使いますか？ ";
			for (int i = 0; i < itemList.size(); i++) {
				str += " (" + i + ")" + itemList.get(i).name;
			}
			str += " (9)使わない > ";
			ch = Util.choice(str);
		} while (!isNum(ch) || !isValid(ch));
		return ch;
	}
	
	private boolean isValid(char ch) {
		int n = ch - '0';
		return n < itemList.size();
	}
	
	private boolean isNum(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}
	
	private void useItem() {
		char ch = selectItem();
		int num = ch - '0';
		if (itemList.get(num) instanceof Potion p) {
			this.hp = Math.min(this.hp + p.recovHp, 100);
			p.recovHp = 0;
			System.out.println
			  (this.name + "は" + p.name + "を使った");
			System.out.println
			  (this.name + "のHPが" + this.hp + "になった" );
			itemList.remove(num);
		} else if (itemList.get(num) instanceof Ether e) {
			this.mp = Math.min(this.mp + e.recovMp, 50);
			e.recovMp = 50;
			System.out.println
			  (this.name + "は" + e.name + "を使った");
			System.out.println
			  (this.name + "のMPが" + this.mp + "になった" );
			itemList.remove(num);
		}
	}
	
	/**
	 * 拾いますか？ y:拾う n:拾わない
	 * 自分の List<Item>にそれを加える
	 * map[アイテムy][アイテムx] を '.' に変える
	 */
	public boolean takeItem(Item item) {
		System.out.println(item.name + "が落ちている！");
		char ch = Util.choice("拾いますか？ y:拾う n:拾わない > ");
		if (ch == 'y') {
			itemList.add(item);
			return true;
		}
		return false;
	}
	
	private void printInfo() {
		System.out.print("HP:" + hp + " MP:" + mp);
		System.out.print(" 持ち物 ");
		for (Item i : itemList) {
			System.out.print(i.name + " ");
		}
		System.out.println();
	}

	private void move(char ch, Board board) {
		switch (ch) {
		case 'w' -> {
			y = Math.max(y-1, 0);
		}
		case 's' -> {
			y = Math.min(y+1, board.ysize-1);
		}
		case 'a' -> {
			x = Math.max(x-1, 0);
		}
		case 'd' -> {
			x = Math.min(x+1, board.xsize-1);
		}
		}
	}
}  // class end
