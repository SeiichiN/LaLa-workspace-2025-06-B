package list.list4;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	private String name;
	private int hp;
	private List<Item> items;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.items = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public List<Item> getItems() {
		return items;
	}
}
