// aN example of a recursive method 

import java.util.Scanner; 

public class triangleRecursion
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the hypotenous of the right triangle: ");
		int side = in.nextInt();
		if (in.hasNextInt())
		{
			printTriangle(side);
		}
		else
		{
			System.out.println("That is not an integer.");
		}
	}

	public static void printTriangle(int sideLength)
	{
		if (sideLength < 1) {return;}
		printTriangle(sideLength -1);
		for(int i = 0; i < sideLength; i++)
		{
			System.out.print("[]");
		}
		System.out.println();
	}
}