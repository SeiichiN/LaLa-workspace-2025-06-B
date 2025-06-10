package p543;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		byte[] data2 = str.getBytes("UTF-8");
		byte[] data3 = str.getBytes();
		
		String str1 = new String(data1);
		System.out.println(str1);
		
	}

}
