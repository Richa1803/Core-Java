package in.co.rays.basics;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num = 153;

		int a = num % 10; // Last number
		int b = (num / 10) % 10; // Middle number
		int c = num / 100; // Last number

		int sum = a * a * a + b * b * b + c * c * c;

		if (sum == num) {
			System.out.println(" Armstrong Number ");

		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
