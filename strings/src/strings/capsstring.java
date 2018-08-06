package strings;

import java.util.*;
public class capsstring {

public void capscalculate()
{

	Scanner in = new Scanner(System.in);
	System.out.println("type the sentence");
	String sentence = in.nextLine();
	
	sentence = " " + sentence;
	
	String caps = " ";
	
	for(int i=0; i<sentence.length(); i++)
	{
		
		char characters = sentence.charAt(i);
		
		if(characters == ' ')
		{
			
			caps = caps + " ";
			char charpositioninc = sentence.charAt(i+1);
			caps = caps + Character.toUpperCase(charpositioninc);
			i++;
		}
		
		else
			
		{
			
			caps = caps + characters;
			
		}
		
	}
	
	System.out.println("word with capital is" + caps);
	
	in.close();
}

public static void main(String args[])
{

	capsstring capsnow = new capsstring();
	capsnow.capscalculate();

}
	
}
