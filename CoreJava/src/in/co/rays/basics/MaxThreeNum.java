package in.co.rays.basics;

public class MaxThreeNum {
	public static void main(String []args) {
	
	int a=10;
	int b=30;
	int c=20;
	
	
	/*if(a>=b && a>=c) 
	{
		   System.out.println("Max number is A "+a);
		   
	  }else if(b>=a && b>=c) 
	  {
		  System.out.println("Max number is B "+b);
	  }else
	  {
		  System.out.println("Max number is c "+c);
	  }*/
   System.out.println("------------------------------------------------------");
      
   int max = Math.max(a,Math.max(b, c));
    
   System.out.println(max);
	
	}

}
