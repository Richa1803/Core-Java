package in.co.rays.basics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;

		System.out.println("Fibonacci");
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println("Series Number " + a);
			a = b;
			b = c;

		}
	}

}
