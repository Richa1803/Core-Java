package in.co.rays.string;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sc = new StringBuffer("Java Developer");

		System.out.println(" Joint Position = " + sc.append(" Programmer"));

		System.out.println("Index Count = " + sc.indexOf("loper"));

		System.out.println("Capcity of storage = " + sc.capacity());

		System.out.println("Find the Character = " + sc.charAt(5));

		System.out.println("Find full length = " + sc.length());

		System.out.println("" + sc.lastIndexOf("mer"));
		System.out.println("Revers Method = " + sc.reverse());
	}

}
