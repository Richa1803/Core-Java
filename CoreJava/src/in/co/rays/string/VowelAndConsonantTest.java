package in.co.rays.string;

public class VowelAndConsonantTest {
	public static void main(String[] args) {
		String str = "hello";
		int vowel = 0;
		int consonant = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("Vowel = " + vowel);
		System.out.println("consonant = " + consonant);
	}

}
