package list.list3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/**
	 * herosというHeroのリストを作成する
	 * ミナト、アサカ、スガワラ。
	 * それぞれHPは100
	 * 一覧表示する
	 */
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		heros.add(new Hero("ミナト", 100));
		heros.add(new Hero("アサカ", 100));
		heros.add(new Hero("スガワラ", 100));
		for (Hero h : heros) {
			System.out.println(h);
		}
	}

}
