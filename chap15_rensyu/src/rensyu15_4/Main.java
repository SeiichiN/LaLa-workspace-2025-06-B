package rensyu15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();  // (1)
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		// System.out.println(day);  // 10
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date d = c.getTime();
		System.out.println(d);  // Thu Sep 18 15:42:38 JST 2025
		SimpleDateFormat f = 
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d);
		System.out.println(s);  // 西暦2025年09月18日
	}
	
	// System.out.println(c);
	// java.util.GregorianCalendar[
	//   time=1749536435561,
	//   areFieldsSet=true,
	//   areAllFieldsSet=true,
	//   lenient=true,
	//   zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",
	//     offset=32400000,
	//     dstSavings=0,
	//     useDaylight=false,
	//     transitions=10,
	//     lastRule=null],
	//   firstDayOfWeek=1,
	//   minimalDaysInFirstWeek=1,
	//   ERA=1,
	//   YEAR=2025,
	//   MONTH=5,
	//   WEEK_OF_YEAR=24,
	//   WEEK_OF_MONTH=2,
	//   DAY_OF_MONTH=10,
	//   DAY_OF_YEAR=161,
	//   DAY_OF_WEEK=3,
	//   DAY_OF_WEEK_IN_MONTH=2,
	//   AM_PM=1,
	//   HOUR=3,
	//   HOUR_OF_DAY=15,
	//   MINUTE=20,
	//   SECOND=35,
	//   MILLISECOND=561,
	//   ZONE_OFFSET=32400000,
	//   DST_OFFSET=0]

}
