package code15_8;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		String w2 = s.replace("def", "XXX");
		System.out.println(w);
		System.out.println(w2);
	}

}
