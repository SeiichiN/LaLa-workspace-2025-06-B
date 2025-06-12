package list.code16_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(Integer.valueOf(10));
		points.add(Integer.valueOf(80));
		points.add(Integer.valueOf(75));
		for (Integer i : points) {
			System.out.println(i.intValue());
		}
	}

}
