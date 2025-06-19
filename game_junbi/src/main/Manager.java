package main;

public class Manager {
	Board board;
	Goblin goblin;
	Slime slime;
	// Hero hero;
	Potion potion;
	Ether ether;
	Wizard hero;
	
	public void start() {
		init();
		while (hero.hp > 0) {
			board.printMap(hero);
			checkHere();
			hero.selectAction(board);
		}
	}
	private void checkHere() {
		char ch = board.map[hero.y][hero.x];
		switch (ch) {
		case 'p' -> {
			if (hero.takeItem(potion)) {
				board.map[hero.y][hero.x] = '.';
			}
		}
		case 'e' -> {
			if (hero.takeItem(ether)) {
				board.map[hero.y][hero.x] = '.';
			}
		}
		case 'g' -> {
			System.out.println("ゴブリンが現れた");
			BattleManager bm = new BattleManager();
			bm.fight(hero, goblin);
			if (goblin.hp <= 0) 
				board.map[goblin.y][goblin.x] = '.';
		}
		case 's' -> {
			System.out.println("スライムが現れた");
			BattleManager bm = new BattleManager();
			bm.fight(hero, slime);
			if (slime.hp <= 0) 
				board.map[slime.y][slime.x] = '.';
		}
		}
	}
	
	private void init() {
		this.board = new Board();
		board.makeMap();  // マップ作成
		this.goblin = new Goblin();
		goblin.setPosition(board);
		this.slime = new Slime();
		slime.setPosition(board);
		this.potion = new Potion();
		potion.setPosition(board);
		this.ether = new Ether();
		ether.setPosition(board);
		this.hero = new Wizard();
		hero.setPosition(board);
	}
}
