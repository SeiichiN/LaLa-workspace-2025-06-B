package p635;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String str = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write(str);
		} catch (IOException e) {
			System.out.println("えらーです");
		} catch (NullPointerException e) {
			System.out.println("nullです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
					System.out.println("クローズしたよ");
				} catch (IOException e) {
					;
				}
			}
		}
		

	}

}
