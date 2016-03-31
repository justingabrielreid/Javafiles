public class removeElement 
{
	public static void main(String[] args)
	{
		int pos = 3;
		double[] values = {67.5, 33, 38, 45, 67, 88, 95, 103, 76};
		int currentSize = values.length;

		for (int i = pos + 1; i < currentSize; i++)
		{
			values[i-1] = values[i];
		}
		currentSize--;
		
		for (int i = 0; i < values.length; i++)
		{
			if (i>0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
	}
}	