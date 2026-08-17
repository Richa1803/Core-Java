package in.co.rays.basics;

import java.util.Scanner;

public class TestZeroEvenOddNumber {

	public static void main(String[] args) {
		// int even = 10;
		int step = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int even = sc.nextInt();
		while (even != 0) {
			if (even % 2 == 0) {
				even = even / 2;
				System.out.println("This " + "is even number");
			} else {
				even = even - 1;
			}
			step++;
			System.out.println(even);
		}
		System.out.println("Step =" + step);
	}
}
