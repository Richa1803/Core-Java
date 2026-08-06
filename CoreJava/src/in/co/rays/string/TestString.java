package in.co.rays.string;

public class TestString {

	public static void main(String []args)
	{
		String name = "I am Hema singh";
		System.out.println(name);
		
		//Length of the String 
		System.out.println("Length of a string is "+name.length());
		
		//Character
		System.out.println("5th Character is"+name.charAt(5));
		
		//Index
		System.out.println("'Hem' Index is "+name.indexOf("Hem"));
		
		//First I Index of position
		System.out.print("First 'i' Position .."+name.indexOf('i'));
		
		//Last i position
		System.out.println("Last Index Position "+name.lastIndexOf('i'));
		
		//Replace
		System.out.println("e is replace by a "+name.replace('a', 'e'));
		
		//LowerCase
		System.out.println("Lower case "+name.toLowerCase());
		
		//UpperCase
		System.out.println("Upper case "+name.toUpperCase());
		
		//Start with Hema
		System.out.println("Start with Hema name"+name.startsWith("Hema"));
		
		//End with singh
		System.out.println("End with ngh "+name.endsWith("ngh")); 
		
		//Substring 
		System.out.print("Substring from index 5 "+name.substring(5));
	}
}
