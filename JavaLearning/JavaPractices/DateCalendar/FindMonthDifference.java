package DateCalendar;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class FindMonthDifference {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd MM yyyy");
		Calendar calendar1=  Calendar.getInstance();
		Calendar cal=  Calendar.getInstance();
		
		String str1= "07 09 1988";
		String str2= "17 06 1982";
		try {
		Date date1=dateFormat.parse(str1);
		calendar1.setTime(date1);
		Date date2= dateFormat.parse(str2);
		cal.setTime(date2);
		//int difference= (date1.getYear()- date2.getYear());
		int difference=calendar1.getWeekYear()-cal.getWeekYear();
		System.out.println(difference);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
