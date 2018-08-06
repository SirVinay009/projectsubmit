package strings;

import java.util.*;
public class stringpalindrome {

	public void palincheck()
	{
		String revcheck = "";
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string to check");
		String palins = in.nextLine();
		
		int finallength = palins.length();
		
		for(int i=finallength-1; i>=0; i--)
			revcheck = revcheck + palins.charAt(i);
		
		if(palins.equalsIgnoreCase(revcheck))
			System.out.println(palins + "is a palindrome");
		else
			System.out.println(palins + "is not a palindrome");
		
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		stringpalindrome palinslength = new stringpalindrome();
		palinslength.palincheck();
		
	}
	
}
