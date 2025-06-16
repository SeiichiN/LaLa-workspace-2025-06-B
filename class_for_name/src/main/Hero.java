package main;

public class Hero {
	static {
		showSelf();
	}
	{
		printSelf();
	}
	String name;
	int hp;
	
	public Hero() {
		this.name = "勇者";
		this.hp = 100;
	}
	
	public static void showSelf() {
		System.out.println("Heroクラスです");
	}
	public void printSelf() {
		System.out.println("this.nameは" + this.name + "です");
	}
	public String toString() {
		return name + ":" + hp;
	}
}
