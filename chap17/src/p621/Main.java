package p621;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("world!");
			fw.close();
		} catch (IOException e) {
			System.out.println("トラブル発生！");
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		System.out.println("終了");
	}

}
