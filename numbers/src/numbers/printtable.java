package numbers;

import java.util.*;

public class printtable {
	
	int numbertill, start;
	
	public void printtablenew()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter till what range you want the tables");
		numbertill = in.nextInt();
		
	for(start = 1; start <= 10; start++)
	{
	
		System.out.println("table of" + start);
		
		
		for(int i=1; i <= numbertill; i++)
		{
			
			System.out.println(start + "*" + i + "=" + (start*i));
			
		}
		
	}
		
	in.close();
		
	}
	
	public static void main(String args[])
	{
		
		printtable printsnow = new printtable();
		printsnow.printtablenew();
		
	}
}
