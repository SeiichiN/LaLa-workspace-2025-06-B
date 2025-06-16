package main;

import java.util.Scanner;

public class Util {
	public static char choice(String msg) {
		System.out.print(msg);
		char ch = new Scanner(System.in).next().charAt(0);
		return ch;
	}
}
