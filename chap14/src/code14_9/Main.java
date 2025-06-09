package code14_9;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 80;
		Hero h2 = new Hero();
		Hero.money = 100;
		System.out.println(Hero.money); // 100
		System.out.println(h1.money);   // 100
		h1.money = 300;
		System.out.println(h2.money);   // 300

	}

}
