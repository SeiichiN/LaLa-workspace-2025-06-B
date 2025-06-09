package code15_4;

public class Main2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + "Java";
			if (i % 20 == 0) s = s + "\n";
		}
		System.out.println(s);
		long end = System.currentTimeMillis();
		System.out.println
		  ("処理時間：" + (end - start) + "ミリ秒");
		
	}

}
