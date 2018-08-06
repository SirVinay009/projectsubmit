package numbers;

import java.util.*;
public class factorial {

	public void fact()
	{
		
		int fact = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		
		for(int i=1; i <= num; i++)
		{
			
			fact = fact * i;
			
		}
		
		System.out.println("factorial is" + fact);
		
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		factorial factsfinal = new factorial();
		factsfinal.fact();
		
	}
	
}
