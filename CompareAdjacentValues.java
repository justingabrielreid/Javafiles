import java.util.Scanner;

public class CompareAdjacentValues 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double input = 0;
		while(in.hasNextDouble())
		{
			double previous = input;
			input = in.nextDouble();
			if (input == previous)
			{
				System.out.print("This is a duplicate number.");
			}	
		}
	}	
}