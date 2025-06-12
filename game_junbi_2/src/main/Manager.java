package main;

public class Manager {
	Board board;
	Goblin goblin;
	Slime slime;
	Hero hero;
	Potion potion;
	Ether ether;
	Item item;
	
	public void start() {
		setup();
		while (true) {
			board.printMap(hero);
			checkHere();
			if (hero.hp <= 0) endGame();
			hero.selectAction(board);
		}
		
	}
	
	private void checkHere() {
		char ch = board.map[hero.y][hero.x];
		switch (ch) {
			case 'p' -> {
				checkItem(potion);
			}
			case 'e' -> {
				checkItem(ether);
			}
			case 'g' -> {
				meetMonster(goblin);
			}
			case 's' -> {
				meetMonster(slime);
			}
		}
	}
	
	private void meetMonster(Monster m) {
		System.out.println(m.name + "が現れた！");
		BattleManager battleManager = new BattleManager();
		battleManager.fight(hero, m);
		if (m.hp <= 0) {
			board.map[m.y][m.x]= '.'; 
		}
		else if (hero.hp <= 0) {
			endGame();
		}
	}
	
	private void endGame() {
		System.out.println("勇者は倒れてしまった。");
		System.out.println("GAME OVER");
		System.exit(0);
	}
	
	private void checkItem(Item i) {
		System.out.println(i.name + "が落ちていた");
		char ch = Util.choice("どうする？ t:拾う n:拾わない > ");
		if (ch == 't') {
			hero.take(i);
			board.map[i.y][i.x] = '.'; 
		}
	}
	
	private void setup() {
		board = new Board();
		board.makeMap();  // マップ作成
		goblin = new Goblin();
		goblin.setPosition(board);
		slime = new Slime();
		slime.setPosition(board);
		hero = new Hero();
		hero.setPosition(board);
		potion = new Potion();
		potion.setPosition(board);
		ether = new Ether();
		ether.setPosition(board);
	}
	
}
