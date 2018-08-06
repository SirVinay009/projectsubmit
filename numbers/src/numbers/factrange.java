package numbers;

import java.util.*;
public class factrange {

	public void facts()
	{
		int fact = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the starting number");
		int num = in.nextInt();
		
		System.out.println("enter till which range");
		int endstop = in.nextInt();
		
		for(int i=1; i < num; i++)
		
			fact = fact * i;
			
		for(int i=num; i <= endstop; i++)
		{
			
			fact = fact * i;
			
		System.out.println("factorial is" + fact);

		}
		
		in.close();
	}
	
	public static void main(String args[])
	{
	
		factrange factsfinal = new factrange();
		factsfinal.facts();
	
}
}
