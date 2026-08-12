package in.co.rays.date;

import java.time.LocalDate;

public class TestGetDob {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1995, 03, 18);

		System.out.println("Your Birth date " + birthDate);

		System.out.println("Year " + birthDate.getYear());
		System.out.println("Month " + birthDate.getMonth());
		System.out.println("Week " + birthDate.getDayOfWeek());
		System.out.println(" " + birthDate.getDayOfYear());
		System.out.println("Month Value " + birthDate.getMonthValue());

	}
}
