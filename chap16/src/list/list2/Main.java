package list.list2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		if (names.isEmpty()) {
			System.out.println("空です");
		}
		names.add("ミナト");
		names.add("アサカ");
		names.add("スガワラ");
		names.add(1, "スズキ");
		names.set(2, "ササキ");
		System.out.println(names.get(2));  // ササキ
		if (names.contains("アサカ")) {
			System.out.println("アサカはあります");
		} else {
			System.out.println("アサカはありません");
		}
		System.out.println(names.indexOf("アサカ"));
		names.remove("ササキ");
		printAll(names);
	}  // main end
	
	public static void printAll(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
}  // class end
