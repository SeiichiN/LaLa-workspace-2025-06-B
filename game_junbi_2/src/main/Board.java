package main;

import java.util.List;

public class Board {
	int ysize;
	int xsize;
	char[][] map;
	
	public Board(int ysize, int xsize) {
		this.ysize = ysize;
		this.xsize = xsize;
		map = new char[this.ysize][this.xsize];
	}
	public Board() {
		this(5, 5);
	}
	public void makeMap() {
		for (int y = 0; y < ysize; y++) {
			for (int x = 0; x < xsize; x++) {				
				map[y][x] = '.';
			}
		}
	}
	public void printMap(List<Character> charList) {
		for (int y = 0; y < ysize; y++) {
			System.out.print("|");
			for (int x = 0; x < xsize; x++) {
				if (y == charList.get(0).y && x == charList.get(0).x) {
					System.out.print(charList.get(0).suffix + "|");
				} else if (y == charList.get(1).y && x == charList.get(1).x) {
					System.out.print(charList.get(1).suffix + "|");
				} else {
					System.out.print(map[y][x] + "|");
				}
			}
			System.out.println();
		}
	}
}
