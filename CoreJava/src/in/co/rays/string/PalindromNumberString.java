package in.co.rays.string;

public class PalindromNumberString {
     public static void main(String []args)
    {
    	 String str ="maam";
    	 String  s= "";
    	 
    	 System.out.println(str.toUpperCase()+"..........."+str.toLowerCase());
    	 
    	 for(int i =str.length()-1; i>=0; i--)
    	 {
    		 s = s+str.charAt(i);
    	 }
    	 System.out.println(s);

    	 if(str.equals(s)) {
    		 System.out.println("This is Palindrom number");
    		 
    	 }else
    	 {
    		 System.out.println("This is Not Palindrom number");
    	 }
    }
}
