package code15_6;

public class Main {

	public static boolean isValidPlayerName(String name) {
		return name.matches("Ma.*");
	}
	
	public static void main(String[] args) {
		String name = "Ma";
		if (isValidPlayerName(name)) {
			System.out.println("正しい");
		} else {
			System.out.println("間違い");
		}

	}

}
