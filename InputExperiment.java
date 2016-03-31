import java.util.Scanner;

public class InputExperiment 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Test of the Scanner in 
		System.out.print("Enter a number");
		int number = in.nextInt();
		System.out.println("Your number is" + number);
	}

}