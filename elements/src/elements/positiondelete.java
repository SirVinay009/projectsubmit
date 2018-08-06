package elements;

import java.util.*;
public class positiondelete {

	public void posdelete()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no of elements in array");
		int num = in.nextInt();
		
		int arrinputs[] = new int[num];
		
		System.out.println("enter the numbers in the array");
		
		for(int i=0; i < num; i++)
		{
			
			arrinputs[i] = in.nextInt();
			
		}
		
		System.out.println("enter the position to delete");
		int delposition = in.nextInt();
		
		for(int i = delposition - 1; i < num - 1; i++)
			arrinputs[i] = arrinputs[i+1];
		
		System.out.println("the final array is");
		
		for(int i = 0; i < num - 1; i++)
			System.out.println(arrinputs[i]);
			
		in.close();
	}
	
	public static void main(String args[])
	{
		
		positiondelete pos = new positiondelete();
		pos.posdelete();
	}
	
}
