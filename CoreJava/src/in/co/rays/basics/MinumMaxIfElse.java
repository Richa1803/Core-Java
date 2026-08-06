package in.co.rays.basics;

public class MinumMaxIfElse {
	public static void main(String[]args)
	{
		int a=5;
		int b=10;
		
		if(b==a) {
			System.out.println("A and B equla...");
		}
			else if(b>a) {
				System.out.println("This is a Max number");
				
			}else if(b<a) {
				System.out.println("This is a Minimum number");
				
			}
			else {
				System.out.println("Invalid Number");
			}
		
	}

}
