package in.co.rays.string;

public class TestHeapAndLiteral {

	public static void main(String[] args) {

		String Str1 = "Hema";
		String Str2 = "Hema";

		String obj = new String("Richa");
		String obj1 = new String("Richa");

		System.out.println("str name 1 " + Str1);
		System.out.println("str name 2 " + Str2);

		System.out.println("obj name = " + obj);
		System.out.println("obj name = " + obj1);

		System.out.println(Str1 == Str2);
		// System.out .println(obj.equals(obj1));
		System.out.println(obj == obj1);

	}

}
