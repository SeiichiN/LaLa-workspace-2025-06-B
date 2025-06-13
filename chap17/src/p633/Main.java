package p633;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String str = null;
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write(str);
			fw.close();
		} catch (IOException | NullPointerException e) {
			System.out.println("書き込みが失敗したよ");
			System.out.println(e.getMessage());
		}
		System.out.println("終了");

	}

}
