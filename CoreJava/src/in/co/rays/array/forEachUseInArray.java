package in.co.rays.array;

public class forEachUseInArray {

	public static void main(String[] args) {
		char[] c = new char[5];
		c[0] = 'H';
		c[1] = 'E';
		c[2] = 'M';
		c[3] = 'A';

		for (char c1 : c) {
			System.out.print(c1);
		}
	}
}
