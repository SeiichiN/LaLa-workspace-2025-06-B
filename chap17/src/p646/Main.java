package p646;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		sub("わんこ");
	}
	
	public static void sub(String str) {
		fileWrite(str);
	}
	
	public static void fileWrite(String str) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (Exception e) {
			;
		}
	}

}
