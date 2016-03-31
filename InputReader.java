// Maximum and Minimum 

import java.util.Scanner;

public class InputReader
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	/* Program will read a sequence of double inputs and print:
	a. Smallest and largest of the inputs
	b. number of even and odd inputs 
	c. Culmutative Totals 
	d. Print adjacent Duplicates
	*/
		System.out.print("Enter a sequences of numbers: ");
		int largest = in.nextInt();
		int smallest = in.nextInt();
		int numberOfEven = 0;
		int numberOfOdd = 0;
		int total = 0;
		int previous = 0;
		
		while  (in.hasNextInt())
		{
			int input = in.nextInt();
			if (input > largest)
			{
				largest = input;
			}
			System.out.println("The largest input is " + largest);
			if (input < smallest)
			{
				 smallest = input;
			}
			System.out.println("The smallest input is " + smallest);
			if (input % 2 == 0)
			{
				numberOfEven++;	
			}
			else
			{
				numberOfOdd++;
			}
			total = total + input;
			if (previous == input)
			{
				System.out.println(previous + " was entered before.");
			}
			
			System.out.println("The number of even integers is " + numberOfEven);
			System.out.println("The number of odd integeres is " + numberOfOdd);
			System.out.println("The total of the entries is " + total);
			
		}	
	}
}
