package p645;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String str = null;
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write(str);
		} catch (Exception e) {
			System.out.println("例外が発生");
		}
		

	}

}
