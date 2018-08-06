package elements;

import java.util.*;
public class deletenumbers {

	public void deletenums()
	{
		int i, j;
		Scanner in = new Scanner(System.in);	
		System.out.println("enter number of elements in the array");
		int num = in.nextInt();
		
	    int arrinput[] = new int[num];
	    
	    System.out.println("Enter the elements");
	    
	    for(i=0; i < num; i++)
	    {
	    	
	    	arrinput[i] = in.nextInt();
	    	
	    }
	    
	    System.out.println("enter the element to be deleted");
	    int delelement = in.nextInt();
	    
	    for(i=0; i < num; i++)
	    	if(arrinput[i] == delelement)
	    		break;
	    
	    if(i < num)
	    {
	    	
	    	num = num - 1;
	    	
	    	for(j = i; j < num; j++)
	    		arrinput[j] = arrinput[j+1];
	    	
	    }
	    
	    System.out.println("after deletion");
	    
	    for(i=0; i < num - 1; i++)
	    {
	    	
	    	System.out.println(arrinput[i] + " ");
	    	
	    }
	       
	    System.out.println(arrinput[num - 1]);
	    
	    in.close();
	}
	
	public static void main(String args[])
	{
		
		deletenumbers dels = new deletenumbers();
		dels.deletenums();
	}
	
}
