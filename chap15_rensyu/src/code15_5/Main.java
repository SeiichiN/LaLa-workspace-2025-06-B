package code15_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate mirai = now.plusDays(100);
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String str = mirai.format(fmt);
		System.out.println(str);  // 西暦2025年09月18日
	}

}
