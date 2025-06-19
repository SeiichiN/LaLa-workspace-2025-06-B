package seisakukadai;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Util {
	
	public static int choice(String s) {//選択肢用メソッド…数字入力
		System.out.println(s);
		int i =new Scanner(System.in).nextInt();
		return i;
	}
	public static String nuki(List<String> l){//配列を文字列に変換する
		StringBuilder s=new StringBuilder();  
		for(int i=0;i<l.size();i++){
		    s.append(l.get(i));
		  }
		return new String(s);
	}
	public static Map<String,String> kaki(List<String> s){//リストを分解してMapに入れなおす
		String ss;
		Map<String,String> m=new HashMap<>();
		for(int i=0;i<s.size();i++) {
			ss=s.get(i);
			String[]lis=ss.split("[,]");
			m.put(lis[0],lis[1]);
			}
		return m;
	}



}

