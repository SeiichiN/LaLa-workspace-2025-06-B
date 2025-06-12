package p621;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String str = null;
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write(str);
			fw.close();
			System.out.println("書き込み成功");
		} catch (IOException e) {
			System.out.println("書き込み失敗");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("nullだよ");
			e.printStackTrace();
		}
		
	}
}
