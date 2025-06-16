package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	String name;
	char suffix;
	List<Item> itemList;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
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
		}
		
	}
	
	private void useItem() {
		if (itemList.size() == 0) {
			System.out.println("まだ何も持ってません");
			return;
		}
		String str = "どれを使いますか？ ";
		for (int i = 0; i < itemList.size(); i++) {
			str += " (" + i + ")" + itemList.get(i).name;
		}
		str += " (9)使わない > ";
		char ch = Util.choice(str);
		System.out.println(ch);
		// 考え中
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
