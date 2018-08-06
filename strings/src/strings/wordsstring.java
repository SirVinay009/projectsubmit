package strings;

import java.util.*;
public class wordsstring {

	public void countwords()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the desired string");
		String str1 = in.nextLine();
		
		int count = 1;
		
		for(int i=0; i<str1.length()-1; i++)
		{
			
			if((str1.charAt(i) == ' ') && (str1.charAt(i+1) != ' '))
			{
				
				count++;
				
			}
			
		}
		
		System.out.println("words in a string are" + count);
	
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		wordsstring counts = new wordsstring();
		counts.countwords();
		
	}
	
}
