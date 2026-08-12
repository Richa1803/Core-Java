package in.co.rays.array;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] arg) {

		int[] arr = { 5, 10, 20, 25, 60, 15 };

		int search = 25;
		int low = 0;
		int high = arr.length - 1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();

		}
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == search) {
				System.out.println("Element found at index =" + mid);
				break;
			} else if (search > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

	}
}
