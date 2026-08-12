package in.co.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat method, formate a Date
public class TestSimpleDateFormat {

	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		String str = format.format(d);

		System.out.println(str);
	}
}
