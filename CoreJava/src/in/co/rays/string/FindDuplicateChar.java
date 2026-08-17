package in.co.rays.string;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String str = "programming";

		// outer loop
		for (int i = 0; i < str.length(); i++) {

			// inner loop
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
					break;

				}

			}

		}
	}
}
