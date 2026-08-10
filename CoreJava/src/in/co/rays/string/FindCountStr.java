package in.co.rays.string;

public class FindCountStr {
	
	public static void main(String []args)
	{
		String str = "solvee";
		//int count=0;
		//char c;
		
		for(char c ='a'; c<='z'; c++)
		{
			int count = 0;

		  for(int i=0; i<str.length(); i++)
		  {
			if(str.charAt(i)==c) 
			{
			 count++;
			}
		  }
		  if(count > 0) {
			  System.out.println(c+ "Fint total count = "+count);
			  //count =0;
		}
	  }	

	}

}
