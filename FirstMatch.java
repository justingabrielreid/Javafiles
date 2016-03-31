import java.util.Scanner;
public class FirstMatch {
	public static void main(String[] args)
	{
	Scanner in = new  Scanner(System.in);
	System.out.println("This program will read the phrase you enter and see if" + "there are spaces in the phrase the phrase");
	System.out.print("Please enter your phrase: ");
	String phrase = in.next();
	boolean found = false;
	char ch = '?';
	int position = 0;
	while(!found && position < phrase.length())
		{
			ch = phrase.charAt(position);
			if (ch== ' ')
				{
					found = true;
					System.out.println("There are space in your" + 					"phrase.");
				}
			else{position++;}
		}	
	}
}