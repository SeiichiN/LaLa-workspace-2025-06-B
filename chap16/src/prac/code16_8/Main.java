package prac.code16_8;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);

	}

}
