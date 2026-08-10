package in.co.rays.string;

public class FindNumCharStr {

	public static void main(String[] args) {
		String str = "Happy";
		int count = 0;
		char c = 'p';

		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
			// System.out.println(count);
		}
		System.out.println("count p = " + count);
	}

}
