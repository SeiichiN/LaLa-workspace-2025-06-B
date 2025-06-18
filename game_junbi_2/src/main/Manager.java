package main;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	Board board;
	Goblin goblin;
	Slime slime;
	Hero hero;
	Potion potion;
	Ether ether;
	Wizard wizard;
	List<Character> charList = new ArrayList<>();
	// Item item;
	
	public void start() {
		setup();
		while (true) {
			board.printMap(charList);
			checkHere();
			if (hero.hp <= 0) endGame();
			hero.selectAction(board);
			wizard.selectAction(board);
		}
		
	}

	/**
	 * 現在の場所情報を得る。
	 * この機能は Characterクラスに実装すべきかどうか
	 * 検討したが、
	 * ポーションやモンスターなどのインスタンスを保持
	 * しているのは Managerクラスなので、
	 * Managerクラスでチェックし、その結果Characterクラス
	 * がポーションを取得する、あるいはモンスターと
	 * 戦うを選択すれば、ポーションやモンスターなどの
	 * インスタンスをCharacterクラスに渡すようにした
	 * ほうが、記述はかんたんになる。
	 */
	private void checkHere() {
		char ch = board.map[hero.y][hero.x];
		switch (ch) {
			case 'p' -> {
				if (hero.takeItem(potion)) {
					updateMap(potion);
				}
			}
			case 'e' -> {
				if (hero.takeItem(ether)) {
					updateMap(ether);
				}
			}
			case 'g' -> {
				meetMonster(goblin);
			}
			case 's' -> {
				meetMonster(slime);
			}
		}
	}
	
	private void updateMap(Item i) {
		board.map[i.y][i.x] = '.'; 
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
	
	private void setup() {
		board = new Board();
		board.makeMap();  // マップ作成
		goblin = new Goblin();
		goblin.setPosition(board);
		slime = new Slime();
		slime.setPosition(board);
		hero = new Hero();
		hero.setPosition(board);
		charList.add(hero);
		potion = new Potion();
		potion.setPosition(board);
		ether = new Ether();
		ether.setPosition(board);
		wizard = new Wizard();
		wizard.setPosition(board);
		charList.add(wizard);
	}
	
}
