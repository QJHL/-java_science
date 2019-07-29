package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		dateToString();
		stringToDate();
	}

	public static void dateToString() {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String s=format.format(new Date());
		System.out.println(s);
	}
	
	public static void stringToDate() {
		try {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=format.parse("2019-07-03 14:13:39");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
