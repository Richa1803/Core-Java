package in.co.rays.array;

public class LinearArray {

	public static void main(String[] args)
	{
		int a[] = {5,6,2,4,8,1,0,};
		
		int search =8;
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==search)
			{
				System.out.println(i);
				break;
			}
			
		}
	}
}
