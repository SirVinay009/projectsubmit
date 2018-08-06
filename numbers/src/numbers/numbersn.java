package numbers;

import java.util.*;

public class numbersn {

	 int num;
    int smallest, biggest;
	Scanner in = new Scanner(System.in);
	
public void bigsmalln()
{
	
	System.out.println("enter number range elements");
	num = in.nextInt();
	
	int arrcheck[] = new int[num];
	
	System.out.println("enter elements");
	
	for(int i=0; i < num; i++)
	{
		arrcheck[i] = in.nextInt();
	}
	
	smallest = arrcheck[0];
	biggest = arrcheck[0];
	
	for(int i=1; i < num; i++)
	{
		
		if(arrcheck[i] > biggest)
			biggest = arrcheck[i];
		else if(arrcheck[i] < smallest)
			 smallest = arrcheck[i];
	}
	
	System.out.println("smallest is" + smallest);
	System.out.println("biggest is" + biggest);
	
}	
public static void main(String args[])
{

	numbersn numn = new numbersn();
	numn.bigsmalln();
	
}
	
}
