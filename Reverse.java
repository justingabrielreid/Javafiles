import java.util.Scanner;
// this program reads, scales and reverses a sequence of numbers 

public class Reverse
{
	
	public static void main(String[] args)
	{
		double[] numbers = readInputs(8);
		multiply(numbers, 10);
		printReversed(numbers);
	// calling all of the methods listed down below. 
	// first the array numbers is initiliazed 

	}
	
	/** 
		The method readInputs will read a sequence of floating point numbers. The parameter numberofInputs is a place 		holder for the number of inputs that will be read. Then it will return an array containing the number of input 		values. 
	*/
	public static double[] readInputs(int numberofInputs)
	{
		System.out.println("Enter " + numberofInputs + " numbers: ");
		Scanner in = new Scanner(System.in);
		double[] inputs = new double[numberofInputs]; /** gives the array inputs a length equal to the number of inputs
*/
		for (int i = 0; i < inputs.length; i++)
		{
			inputs[i] = in.nextDouble(); 
		}
		return inputs; 

	}
	/** 
		The method multiply multiplies all elements of the array by a factor. 
		The parameter values is an array. 
		The parameter factor is a double that is multiplied to the array 		elements. 
	*/
	
	public static void multiply(double[] values, double factor)
	{
		for (int i = 0; i < values.length; i++)
		{
			values[i] = values[i] * factor;
		}
	}
/**
	Prints an array in reversed order 
	The paramater values is an array of double values
	returns an array where the elements have been reversed in order 
*/	
	public static void printReversed(double[] values)
	{
		// Tranverse the array in reverse order, start with the last element in the array  
		for (int i = values.length - 1; i >= 0; i--)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();

	}


}