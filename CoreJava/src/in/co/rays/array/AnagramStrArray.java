package in.co.rays.array;

import java.util.Arrays;

public class AnagramStrArray {
	public static void main(String []args)
	{
		String str1 ="listen";
		String str2 = "silent";
		
		char []a = str1.toCharArray();
		char []b = str2.toCharArray();
		
		//System.out.println("Sorting str1 "+Arrays.sort(a));
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)) {
			System.out.println("This is Anagram ");
			
		}else {
			System.out.println("This is not Anagram ");
		}

				
		}
	}


