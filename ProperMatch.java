import java.util.Scanner;
// prompting until a proper match is found
// can be used to ensure that the user enters a valid input
public class ProperMatch 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		System.out.print("Enter a number between 1 and 100: ");
		if(in.hasNextInt())
		{
			int number = in.nextInt();
			if (number >= 1 && number <= 100)
			{
				System.out.println("Wow you can follow instructions");
			}
			else
			{
				System.out.println("That number is not in the specified" 				+ "range");
			}
		}
		else 
		{
			System.out.println("That is not a valid input");
		}
	}
}
