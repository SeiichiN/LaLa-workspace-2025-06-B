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
		
		String str1B = String.valueOf(data1);
		System.out.println(str1B);
		
		String str2 = new String(data2);
		System.out.println(str2);
		
		String str3 = new String(data3);
		System.out.println(str3);
		
	}

}
