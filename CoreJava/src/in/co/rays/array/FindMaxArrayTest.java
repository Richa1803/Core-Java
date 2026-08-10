package in.co.rays.array;

public class FindMaxArrayTest {

	public static void main(String[] args) {
		int num[] = { 10, 5, 20, 25, 15, 17, 45 };

		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println("Max Number " + max);

	}

}
