// this program prints a table of the powers of x 

public class PowerTable 
{
	public static void main(String[] args)
	{
		final int NMAX = 4; // numbers of rows
		final double XMAX = 10; // number of columns
//Print the table header
		for (int n = 1; n<=NMAX; n++)
		{
			System.out.printf("%10d", n);
		}
		System.out.println();
		for(int n = 1; n <= NMAX; n++)
		{
			System.out.printf("%10s", "x ");
		}
		System.out.println();
		// Print table body 
		for (double x =1; x<= XMAX; x++)
		{
			// print table row 
			for(int n = 1; n <= NMAX; n++)
			{
				System.out.printf("%10.0f", Math.pow(x,n));
			}
			System.out.println();
		}		
	}
}


