package in.co.rays.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestLocalDateFormat {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.print(today);
		System.out.println();
		System.out.println("=================================");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println(formatter.format(today));

	}
}
