package numbers;

public class primeprint {

	public void printprimenumbers()
	{
		
		int num = 100, flag;
		
		for(int start = 2; start < num; start++)
		{
			
			flag = 0;
			
			for(int startcheck = 2; startcheck < start; startcheck++)
			{
				
				if(start % startcheck == 0)
					flag = 1;
				
			}
			
			if(flag == 0)
				System.out.println(start);
			
		}
		
	}
	
	public static void main(String args[])
	{
		
		primeprint pints = new primeprint();
		pints.printprimenumbers();
		
	}
	
	
}
