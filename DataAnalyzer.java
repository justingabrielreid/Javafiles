import java.io.File;
import java.io.FIleNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;

/** 
	This program processes a file containg a count of the data values followed by the data values. 
	If the file doesn't exist or the format is incorrect, another file can be specified. 
*/

public class DataAnalyzer
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		/**
			The while loop is designed to keep trying to have an acceptable input until there are no more 
			exceptions. 
		*/
		boolean done = false; 
		while(!done)
		{
			try
			{
				System.out.print("Please enter the file name: ");
				String filename = in.next(); 
				double[] data = readFile(filename);
				
				// process the data here: 
				

				done = true;
			}
			catch(FileNotFoundException)
			{
				System.out.println("File not found.");
			}
			catch (NoSuchElementException)
			{
				System.out.print("File contents invalid");
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}
	}
	/**
		Method readFile opens a file and reads a data set. the parameter filename is the name of the file 
		holding the data. 
		returns the data in the file. 
	*/
	public static double[] readFile(String filename) throws IOException
	{
		File inFile = new File(filename);
		Scanner in = new Scanner(inFile);
		try
		{
			return readData(in);
		}
		finally
		{
			in.close();
		}
	
	}
	/**
		Reads a data set. 
		The parameter is the scanner which scans the data 
		returns the data in the file
	*/
	public static double[] readData(Scanner in) throws IOException
	{
		int numberOfValues = in.nextInt(); // May throw NoSuchElementException
		double[] data = new double[numberOfValues];
		for (int i = 0; i < numberOfValues; i++)
		{
			data[i] = in.nextDouble(); // may throw NoSuchElementException
		}
		if (in.hasNext())
		{
			throw new IOException("End of file expected");
		}
		return data;
	}
}