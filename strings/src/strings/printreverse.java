package strings;

public class printreverse {

	public void prints()
	{
		
		String input = "NIITVASHI tuition center";
		String input2 = "Vashi sector 17";
		
		input = input.replaceAll("\\s","");
		
		char[] inputcheck = input.toCharArray();
		
		for(int i = inputcheck.length-1; i>= 0; i--)
			System.out.print(inputcheck[i]);
		
		System.out.println("\n");
		
		char[] inputcheck2 = input2.toCharArray();
		
		for(int i=inputcheck2.length-1; i >= 0; i--)
			System.out.print(inputcheck2[i]);
		
	}
	
	public static void main(String args[])
	{
		
		printreverse print = new printreverse();
		print.prints();
		
	}
	
}
