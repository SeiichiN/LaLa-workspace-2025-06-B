package p543;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		byte[] data2 = str.getBytes("utf-8");
		byte[] data3 = str.getBytes();

		String str1 = new String(data1);
		System.out.println(str1);
		String str2 = new String(data2);
		System.out.println(str2);
		String str3 = new String(data3);
		System.out.println(str3);
		
	}

}
