package seisakukadai;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Jisyo j =new Jisyo();
		List<String> li=Ymkk.yomikomi();
//		//System.out.println(li.get(1));
//		String b =Util.nuki(li);
//		System.out.println(b);
//		System.out.println(Util.kaki(li).keySet());
//		for(String s:Util.kaki(li).keySet()) {
//			j.wl.put(j.wl.size(), s);
//		}
		Ymkk.kakikomi(Util.kaki(li));
		
//		System.out.println(Util.kaki(li).get(j.wl.get(0)));
//		System.out.println(Util.kaki(li).get(j.wl.get(1)));
		
	}

}
