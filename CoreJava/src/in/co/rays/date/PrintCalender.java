package in.co.rays.date;

import java.util.Date;

public class PrintCalender {
	public static void main(String[] args)
	{
		Date date = new Date();
		
		System.out.println("Calendar Date :"+date);
		System.out.println("Calendar Year 2027");
		
		for(int month=1; month<=12; month++) {
			System.out.println("Month :"+month);
			for(int day=1; day<=31; day++)
			{
				System.out.print(day+" ");
			}
			System.out.println();
		}
	}

}
