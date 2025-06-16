package rensyu17_3;

import java.util.Scanner;

/**
 * 次のような内容の静的メソッド inputNumber() を
 * 作成してください。
 *
 * (1) public static int inputNumber() {・・・} とします。
 *
 * (2) Scanner(System.in) でキー入力を促して、
 *     String型変数に代入します。
 *
 * (3) そのString型変数を数字に変換し、
 *     成功すれば、その数を戻り値とします。
 *    
 * (4) 数字への変換が失敗すれば（例外が発生すれば）
 *     再度入力するようにします。(2)に戻ります。
 *     
 * (5) このメソッドをmain()メソッドから呼び出して、
 *     数字を取得し、int型変数numに代入します。
 */
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
