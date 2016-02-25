import java.util.Scanner;

/** 
	Checks whether the integer is even or odd. Returns TRUE if even FALSE if odd
**/
public class EvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer value to check and see if it is even");
		int num = in.nextInt();
		System.out.print("Your integer is even: " + isEven(num));
	}
	
/**
	This method checks the input to see if it is even or odd. The if statement 
	is to see if the number passes the condition that when divided by 2 is the 
	remainder of the operation 0, if not then the method returns true. If it does
	not pass this condition then the number returns false. 
**/
	public static boolean isEven(int x)
	{
		boolean t = false;
		if (x % 2 == 0)
		{
			t = true;
			return t;
		}
		else
		{
			return t;
		}
	}
}

