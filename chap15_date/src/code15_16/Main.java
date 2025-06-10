package code15_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = 
				LocalDate.parse("2023/09/22", fmt);
		System.out.println(ldate);  // 2023-09-22
		
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println(ldatep);  // 2026-06-18
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);  // 1000日後は2026/06/18
		
		LocalDate now = LocalDate.now();
		System.out.println(now);  // 2025-06-10
		if (now.isAfter(ldatep)) {
			System.out.println("本日は、その日より未来です");
		}
		
		
		
		
	}

}
