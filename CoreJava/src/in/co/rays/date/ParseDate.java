package in.co.rays.date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Parse date method work string to convert date form
public class ParseDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		String str = "18/03/2026";
		Date d1 = format.parse(str);
		System.out.println(str);
	}
}
