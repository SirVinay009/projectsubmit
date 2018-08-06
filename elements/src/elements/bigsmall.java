package elements;

import java.util.*;
public class bigsmall {

	public void bigssmalls()
	{
		int biggest, smallest;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the no of elements");
		int num = in.nextInt();
		
		int arrnum[] = new int[num];
		
		for(int i=0; i < num; i++)
		{
			
			arrnum[i] = in.nextInt();
			
		}
		
		smallest = arrnum[0];
		biggest = arrnum[0];
		
		for(int i=1; i<num; i++)
		{
			
			if(arrnum[i] > biggest)
				biggest = arrnum[i];
			else if(arrnum[i] < smallest)
				smallest = arrnum[i];
			
		}
		
		System.out.println(biggest + "is biggest");
		System.out.println(smallest + "is smallest");
	
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		bigsmall bs = new bigsmall();
		bs.bigssmalls();
		
	}
	
}
