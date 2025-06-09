package main;

import java.util.Scanner;

public class BattleManager {
	public void fight(Character c, Monster m) {
		while (c.getHp() > 0 && m.getHp() > 0) {
			System.out.print(c.getName() + ":HP" + c.getHp() + " ");
			System.out.println(m.getName() + ":HP" + m.getHp());
			System.out.print("A:戦う Q:逃げる > ");
			char ch = new Scanner(System.in).next().charAt(0);
			if (ch == 'q') break;
			c.attack(m);
			m.attack(c);
		}
		if (c.getHp() <= 0) {
			System.out.println(c.getName() + "は倒れた！");
		}
		if (m.getHp() <= 0) {
			System.out.println(m.getName() + "を倒した！");
		}
		System.out.println("戦いは終了");
	}
}
