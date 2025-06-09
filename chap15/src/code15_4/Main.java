package code15_4;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			if (i % 20 == 0) sb.append("\n");
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
		long end = System.currentTimeMillis();
		System.out.println
		  ("処理時間：" + (end - start) + "ミリ秒");

	}

}
