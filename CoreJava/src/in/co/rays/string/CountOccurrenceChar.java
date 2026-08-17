package in.co.rays.string;

public class CountOccurrenceChar {
	public static void main(String[] args) {
		String str = "programming";
		char search = 'm';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == search) {
				count++;
			}
		}
		System.out.println(" count = " + count);
	}

}
