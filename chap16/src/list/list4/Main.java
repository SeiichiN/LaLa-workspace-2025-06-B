package list.list4;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("ミナト", 100);
		hero.getItems().add(new Potion("ポーション"));
		Item i = new Ether("エーテル");
		hero.getItems().add(i);
		for (Item item : hero.getItems()) {
			System.out.println(item);
		}
	}

}
