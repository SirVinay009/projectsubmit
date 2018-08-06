package elements;

import java.util.Scanner;

public class displaynumbers {

	public void display()
	{
		
		int num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter how many numbers you want for display");
		num = in.nextInt();
		
		int arrdisplay[] = new int[num];
		
		System.out.println("enter the numbers for display");
		
		for(int i=0; i < num; i++)
		{
			
			arrdisplay[i] = in.nextInt();
			
		}
		
		System.out.println("the elements displayed are");
		
		for(int i=0; i < num; i++)
		{
			
			System.out.println(arrdisplay[i]);
			
		}
		
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		displaynumbers disp = new displaynumbers();
     	disp.display();
		
	}
	
}
