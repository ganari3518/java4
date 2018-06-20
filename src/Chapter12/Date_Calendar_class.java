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
		
		System.out.println("���� ��¥�� "+year+"�� "+month+"�� "+date+"�� �Դϴ�.");
		
		int hour = cal.get(cal.HOUR); 
		int min = cal.get(cal.MINUTE); 
		int sec = cal.get(cal.SECOND); 
		int ampm = cal.get(cal.AM_PM); 

		if(ampm == cal.AM)
			System.out.print("���� �ð��� AM ");
		else
			System.out.print("���� �ð��� PM ");
		
		System.out.println(hour+"�� "+min+"��"+sec+"��");
		
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("YYYY�� MM�� dd�� HH�� mm�� ss��");
		
		String df = sf.format(d);
		System.out.println(df);			 
	}

}
