package code15_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy-MM-dd");
		Date d;
			d = f.parse("2023-09-18");
		System.out.println(d);
		
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
		
	}

}
