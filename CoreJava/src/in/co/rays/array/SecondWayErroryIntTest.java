package in.co.rays.array;

import java.util.Scanner;

public class SecondWayErroryIntTest {
	
	public static void main(String []args)
	{
		int a[] = new int[6];
		    a[0]= 2;
		    a[1]= 4;
		    a[2]= 6;
		    a[3]= 8;
		    a[4]= 10;
		    a[5]= 12;
		    		
		System.out.println(a[2]+","+a[3]);
		System.out.println("=======================");

		for(int c:a) {
			System.out.println(c);
		}
		
		
	}

}
