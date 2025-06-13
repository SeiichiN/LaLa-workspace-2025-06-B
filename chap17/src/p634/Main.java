package p634;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String str = null;
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write(str);
			fw.close();
		} catch (Exception e) {
			System.out.println("何らかの例外が発生");
			// System.out.println(e.getMessage());
		}
		

	}

}
