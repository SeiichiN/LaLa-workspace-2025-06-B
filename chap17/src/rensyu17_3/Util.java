package rensyu17_3;

import java.util.Scanner;

public class Util {
	public int inputNumber() {
		int i = -1;
		boolean isRepeat = true;
		while (isRepeat) {
			System.out.print("数字を入力してください > ");
			String numstr = new Scanner(System.in).nextLine();
			try {
				i = Integer.parseInt(numstr);
				isRepeat = false;
			} catch (NumberFormatException e) {
				System.out.println("数字ではない");
			}
		}
		return i;
	}
}
