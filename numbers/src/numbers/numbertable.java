package numbers;
import java.util.*;

public class numbertable {

	int num, numstop;
	
	public void numtable()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the integer to produce the multiplication table");
		num = in.nextInt();
		
		System.out.println("enter till which times table you want");
		numstop = in.nextInt();
		
		System.out.println("multiplication table is");
		
		for(int i=1; i<=numstop; i++)
			System.out.println(num + "*" + i + "=" + (num*i));
		
		in.close();
		
	}
	
	public static void main(String args[])
	{
		
		numbertable numstable = new numbertable();
		numstable.numtable();
		
	}
	
}
