package numbers;

import java.util.*;
public class armstrong {

	public void arms()
	{

	int armanswer = 0, armcheck, remainder;	
   
    Scanner in = new Scanner(System.in);
	System.out.println("enter the number to check armstrong or not");
	int num = in.nextInt();
	
	armcheck = num;
	
	while(num > 0)
	{
		
		remainder = num % 10;
		num = num / 10;
		armanswer = armanswer + (remainder * remainder * remainder);
		
	}
	
	if(armcheck == armanswer)
	{
		
		System.out.println(armanswer +"is armstrong");
		
	}
	
	else
	{
		
		System.out.println(armanswer + "is not armstrong");
		
	}
	
	in.close();
	
	}
	
	public static void main(String args[])
	{
		
		armstrong arm = new armstrong();
		arm.arms();
		
	}
	
}
