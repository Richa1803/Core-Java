package in.co.rays.array;

public class ForEachStringArray {

	public static void main(String[] args) {

		String str[] = new String[7];

		str[0] = " Sunday";
		str[1] = " Monday";
		str[2] = " Tuesday";
		str[3] = " Wednesday";
		str[4] = " Thursday";
		str[5] = " Friday";
		str[6] = " Saturday";

		for (String week : str) {
			System.out.print(week);
		}

	}

}
