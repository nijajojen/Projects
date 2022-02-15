package DateCalendar;
import java.util.Date;
import java.util.Calendar;


public class FirstProgram {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		Calendar calendar= Calendar.getInstance();
		//calendar.setTime(date);
		
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH, 11);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE, 1);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2025);
		System.out.println(calendar.getTime());

		Date date2 = calendar.getTime();
		System.out.println(date2);
		//Mon Sep 02 14:42:02 PDT 2019
	}

}
