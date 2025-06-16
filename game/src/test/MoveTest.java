package test;

import main.Board;
import main.Hero;

public class MoveTest {

	public static void main(String[] args) {
		Board board = new Board();
		board.makeMap();
		Hero h = new Hero();
		h.setPosition(board);
		while(true) {
			h.selectAction(board);
			board.printMap(h);
		}
	}

}
