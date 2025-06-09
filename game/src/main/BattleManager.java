package main;

public class BattleManager {
	public void fight(Character c, Monster m) {
		while (c.hp > 0 && m.hp > 0) {
			System.out.print(c.name + ":HP" + c.hp + " ");
			System.out.println(m.name + ":HP" + m.hp);
			
			char ch = Util.choice("A:戦う Q:逃げる > ");
			
			if (ch == 'q') break;
			c.attack(m);
			m.attack(c);
		}
		if (c.hp <= 0) {
			System.out.println(c.name + "は倒れた！");
		}
		if (m.hp <= 0) {
			System.out.println(m.name + "を倒した！");
		}
		System.out.println("戦いは終了");
	}
}
