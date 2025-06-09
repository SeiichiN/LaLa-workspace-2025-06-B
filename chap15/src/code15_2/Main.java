package code15_2;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println
			  ("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1でJavaが最初に登場する位置は" +
		      s1.indexOf("Java"));

		System.out.println("文字列s1でJavaが最後に登場する位置は" +
			      s1.lastIndexOf("Java"));
		
	}

}
