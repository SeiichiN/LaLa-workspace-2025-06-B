package code14_9;

public class Main2 {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		h1.setRandomMoney();
		System.out.println(h1.money);

	}

}
