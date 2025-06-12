package list.list1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = 
			new ArrayList<>();

		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
