package in.co.rays.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Hema Hemant");

		System.out.println("Append = " + name.append(" Singh Java"));
		System.out.println("" + name.append("Developer", 0, 5));

		System.out.println("Find length = " + name.length());
		System.out.println("Find capacity = " + name.capacity());
		System.out.println("Find char = " + name.charAt(2));
		System.out.println("Find Index = " + name.indexOf("Hemant"));
		System.out.println("Find replace = " + name.replace(0, 5, " Richa"));
		System.out.println("Revers = " + name.reverse());
		// System.out.println(" Before = "+name.codePointBefore(3));

	}

}