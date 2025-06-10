package code15_9;

public class Main {

	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,7d";
		
		Hero[] heros = new Hero[3];
		heros[0] = new Hero("minato", "hero", 280);
		heros[1] = new Hero("asaka", "witch", 32000);
		heros[2] = new Hero("sugawara", "sage", 41000);

		for (Hero h : heros) {
			String s = String.format(FORMAT, h.getName(), h.getJob(), h.getGold());
			System.out.println(s);
		}
		
	}

}
