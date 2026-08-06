package in.co.rays.basics;

import java.util.Scanner;

public class WeeklySwitchCase {
	public static void main(String []args)
	{
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println(" Select Your Days... ");
      String Day = sc.next();
      
        switch(Day)
        {
        case "Monday":
        	System.out.println("Today my working day");
        	break;
        
        case "Tuesday":
        	System.out.println("5 PM going to market");
        	break;
        	
        case "Wednesday":
            System.out.println("Studay day.....");
            break;
            
        case "Thursday":
        	System.out.println("Continus........study");
        	break;
        	
        case "Friday":
        	System.out.println("Going to temple..");
        	break;
        	
        case "Saturday":
        	System.out.println("Off day...");
        	break;
        	
        case "Sunday":
        	System.out.println("Sunday fun day...");
        	break;
        	
        	default:
        	    System.out.println("Default.....");
        }sc.close();
      
	}

}
