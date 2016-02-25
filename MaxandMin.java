// Maximum and Minimum 

import java.util.Scanner;

public class MaxandMin
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	/* to compute the largest value, keep a varible that stores the largest value 		and then updates it when a larger value is found.*/
		System.out.print("Enter a number: ");
		double largest = in.nextDouble();
		while  (in.hasNextDouble())
		{
			double input = in.nextDouble();
			if (input > largest)
			{
				largest = input;
			}
			System.out.println("The largest input is " + largest);
		}	
	}
}
