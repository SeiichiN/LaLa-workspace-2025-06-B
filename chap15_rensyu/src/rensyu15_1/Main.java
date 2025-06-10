package rensyu15_1;

public class Main {

	public static void main(String[] args) {
		// String s = plus();
		String s = useBuilder();
		String[] a = s.split(",");
		for (String ss : a) {
			System.out.println(ss);
		}
	}
	
	public static String useBuilder() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		return s;
	}
	
	public static String plus() {
		String s = "";
		for (int i = 1; i <= 100; i++) {
			s = s + i + ",";
		}
		System.out.println(s);
		return s;
	}

}
