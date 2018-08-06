package numbers;

import java.util.*;

public class bigsmall {

	Scanner in = new Scanner(System.in);
	
	double firsts, seconds, thirds, firstsmallest, secondsmallest, thirdsmallest;

	public void big()
	{
		
		System.out.println("enter the three numbers");
		firsts = in.nextDouble();
		seconds = in.nextDouble();
		thirds = in.nextDouble();
if( firsts > seconds && firsts > thirds)
{
	System.out.println("first is largest");
}
else if( seconds > firsts && seconds > thirds)
{
	System.out.println("second is largest");
}
else if( thirds > firsts && thirds > seconds)
{
	System.out.println("third is largest");
}
else
{
	System.out.println("Numbers are equal");
}		
	}
	
	public void small()
	{
		System.out.println("enter the three numbers");
		firstsmallest = in.nextDouble();
		secondsmallest = in.nextDouble();
		thirdsmallest = in.nextDouble();
		
if( firstsmallest < secondsmallest && firstsmallest < thirdsmallest)
{
	System.out.println("first is smallest");
}
else if( secondsmallest < firstsmallest && secondsmallest < thirdsmallest)
{
	System.out.println("second is smallest");
}
else if( thirdsmallest < firstsmallest && thirdsmallest < secondsmallest)
{
	System.out.println("third is smallest");
}
else
{
	System.out.println("Numbers are equal");
}		
		
	}
	
	public static void main(String args[])
	{

		bigsmall bigsmalls = new bigsmall();

bigsmalls.big();
bigsmalls.small();


	}
}
