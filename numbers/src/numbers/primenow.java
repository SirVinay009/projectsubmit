package numbers;

import java.util.*;
public class primenow {

	public void primes()
	{
		
		
		Scanner in = new Scanner(System.in);
		
		int flag = 0;
		
		System.out.println("enter the number to check");
		int check = in.nextInt();
		
		for(int starting = 2; starting <= check/2; starting++)
		{
			
			
			if(check % starting == 0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) 
				System.out.println("number is a prime");
		else
			System.out.println("number is not prime");
		
		in.close();
			
		}
	
	public static void main(String args[])
	{
		
	primenow primesfinal = new primenow();
	primesfinal.primes();
		
		
	}
		
	}
	

