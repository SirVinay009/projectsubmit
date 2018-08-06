package elements;

import java.util.*;
public class numberpos {

	public void position()
	{
		
		int num, position, numinsert;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter no of elements");
		num = in.nextInt();
		
		int arrinsert[] = new int[num + 1];
		
		System.out.println("enter the elements");
		
		for(int i=0; i < num; i++)
		{
			
			arrinsert[i] = in.nextInt();
			
		}
		
		System.out.println("enter the desired position and number");
		position = in.nextInt();
		numinsert = in.nextInt();
	
		for(int i = (num - 1); i >= (position - 1); i--)
		{
			
			arrinsert[i+1] = arrinsert[i];
			
		}
			
	    arrinsert[position - 1] = numinsert;
		
		System.out.println("after insertion");
		
		for(int i = 0; i < num; i++)
		{
		
			System.out.println(arrinsert[i] + " ");
					
		}
		
		System.out.println(arrinsert[num]);
		
		in.close();
	}
	
	public static void main(String args[])
	{
		
		numberpos pos = new numberpos();
		pos.position();
		
	}
	
}
