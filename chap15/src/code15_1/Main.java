package code15_1;

public class Main {

	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "Java";
		String s4 = "";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println
			  ("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s4.isEmpty()) {
			System.out.println("s4は空文字です");
		}
	}

}
