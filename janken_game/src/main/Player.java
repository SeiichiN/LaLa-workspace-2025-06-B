package main;

public abstract class Player {
	String name;
	int hand;
	String result;
	final String[] HAND_NAME = {"グー", "チョキ", "パー"};
	
	abstract void setHand();
	
	public void judge(Player p) {
		if (this.hand == p.hand) {
			this.result = "あいこ";
		} else if ((this.hand + 1) % 3 == p.hand) {
			this.result = "勝ち";
		} else {
			this.result = "負け";
		}
	}
	
	public void showResult() {
		System.out.print(this.name + ":");
		System.out.print(HAND_NAME[this.hand] + ":");
		System.out.println(this.result);
	}
}
