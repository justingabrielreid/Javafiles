import java.util.Scanner;

public class stringBox 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text below.");
		System.out.print(": ");
		String statements = in.next();
		boxString(statements);
	}


	public static void boxString(String contents)
	{
		
// An example of a method without a return value 
		int n = contents.length();
		for (int i = 0; i < n+2; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("|" + contents + "|");
		for (int i = 0; i < n +2; i++);
		{
			System.out.print("-");
		}
		System.out.println();
	}
}