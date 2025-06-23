package main;

import java.util.Scanner;

public class User extends Player {
	
	public User() {
		this.name = "ユーザー";
	}

	@Override
	void setHand() {
		// 例外処理が必要
		System.out.print("0:グー 1:チョキ 2:パー > ");
		this.hand = new Scanner(System.in).nextInt();
	}

}
