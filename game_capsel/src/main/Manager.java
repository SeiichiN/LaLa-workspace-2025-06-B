package main;

public class Manager {
	public void start() {
		Board board = new Board();
		board.makeMap();  // マップ作成
		Goblin goblin = new Goblin();
		goblin.setPosition(board);
		Slime slime = new Slime();
		slime.setPosition(board);
		Hero h = new Hero();
		h.setPosition(board);
		board.printMap(h);
	}
	
}
