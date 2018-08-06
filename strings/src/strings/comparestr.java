package strings;

import java.util.*;
public class comparestr {

	public void compstring()
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter your first string");
		String str1 = in.nextLine();
		
		System.out.println("enter your second string");
		String str2 = in.nextLine();
		

		System.out.println("enter your third string");
		String str3 = in.nextLine();

		System.out.println("enter your fourth string");
		String str4 = in.nextLine();
		
		String str5 = "this final string";
		String str6 = "tutorial";
		
		if(str1.equals(str2))
		{	
			System.out.println("first condition of both strings is" + "\t" + str1.equals(str2));
		}
		
		else	
		{
			System.out.println("the two strings are not equal to each other");
		}
		
		if(str3 == str4)
		{
			System.out.println("condition is" + str3 == str4);
		}
		
		else
		{
			System.out.println("the two strings are not equal to each other");
		}
		
		System.out.println(str5.compareTo(str6));
		
		in.close();
	}
	
   public static void main(String args[])
   {
	   
	   comparestr coms = new comparestr();
	   coms.compstring();
	   
   }
}
