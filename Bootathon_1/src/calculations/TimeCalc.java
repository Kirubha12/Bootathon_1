package calculations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeCalc {
	public static long  getTotalTime(String IN,String Out) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		long ans = 0;
		try {
			Date d1 = sdf.parse(IN);
            Date d2 = sdf.parse(Out);
            long difference_In_Time = d2.getTime() - d1.getTime();
            System.out.println(difference_In_Time);
            long difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;
            long difference_In_Days = TimeUnit.MILLISECONDS.toDays(difference_In_Time) % 365;
            ans = difference_In_Days*24 + difference_In_Hours;
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return ans;
		
	}
	public static void main(String[] args) {
	String start_date  = "10-01-2018 01:10:20";
    String end_date  = "10-01-2018 06:30:50";
		long Time_in_hours = getTotalTime(start_date,end_date);
		System.out.println(Time_in_hours);
		String k = new BillGeneration().BillCalculation(Time_in_hours, "Car");
		System.out.println(k);
	}
}
