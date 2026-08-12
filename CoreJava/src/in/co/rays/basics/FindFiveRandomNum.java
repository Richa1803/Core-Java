package in.co.rays.basics;

public class FindFiveRandomNum {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			int num = (int) Math.random() * 100 + 1;

			System.out.println(num);
		}
	}

}
