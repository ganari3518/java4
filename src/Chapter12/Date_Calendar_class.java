package Chapter12;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date_Calendar_class {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR); // == Calendar.getInstance().YEAR
		int month = cal.get(cal.MONTH); // == Calendar.getInstance().MONTH
		int date = cal.get(cal.DATE); // == Calendar.getInstance().DATE 
		
		System.out.println("오늘 날짜는 "+year+"년 "+month+"월 "+date+"일 입니다.");
		
		int hour = cal.get(cal.HOUR); 
		int min = cal.get(cal.MINUTE); 
		int sec = cal.get(cal.SECOND); 
		int ampm = cal.get(cal.AM_PM); 

		if(ampm == cal.AM)
			System.out.print("현재 시간은 AM ");
		else
			System.out.print("현재 시간은 PM ");
		
		System.out.println(hour+"시 "+min+"분"+sec+"초");
		
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("YYYY년 MM월 dd일 HH시 mm분 ss초");
		
		String df = sf.format(d);
		System.out.println(df);			 
	}

}
