package in.co.rays.basics;

import java.util.Scanner;

public class SwitchCalc {
	public static void main(String []args)
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter First Number.....");
	  int a = sc.nextInt();
	  
	  System.out.println("Enter Second Number......");
	  int b = sc.nextInt();
	  
	  System.out.println("Select Option..'+','-','*','/','%'");
	  String Opr = sc.next();
	  
	  switch(Opr)
	  {
	  case "+":
		  System.out.println("Result.."+(a+b));
		  break;
		  
	  case "-":
		  System.out.println("Result.."+(a-b));
		  break;
		  
	  case "*":
		  System.out.println("Result.."+(a*b));
		  break;
		  
	  case "/":
		  System.out.println("Result.."+(a/b));
		  break;
		  
	  case "%":
		  System.out.println("Result.."+(a%b));
		  break;
		  
		  default:
			  System.out.println("Default Input...");
	  }sc.close();
	}

}
