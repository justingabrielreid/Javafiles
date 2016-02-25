import java.util.Scanner;

public class largestElementInArray
{
	public static void main(String[] args)
	{
		final int LENGTH = 100; 
		double[] values = new double[LENGTH];
		int currentSize =0;

		//read inputs 
		System.out.println("Please enter values; press Q to quit:");
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble() && currentSize < values.length)
		{
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		double largest = values[0];
		for(int i = 1; i < currentSize; i++)
		{
			if (values[i] > largest)
			{
				largest = values[i];
			}
		}
		for (int i = 0; i < currentSize; i++)
		{
			System.out.print(values[i])
			if (values[i] == largest)
			{
				System.out.print(" <= largest value");
			}
			System.out.println();
		}
		
	}
}