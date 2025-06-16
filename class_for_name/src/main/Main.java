package main;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("main.Hero");
		Hero h = new Hero();
		System.out.println(h);
	}

}
