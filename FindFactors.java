import java.util.Scanner;
public class FindFactors{
	
	public static void main (String args[])
{
		Scanner in = new Scanner(System.in);
		int num,factorcounter = 0;
		int sumfactors = 0;
		System.out.print("Enter a positive integer.");
		while(in.hasNextInt())
	{
			factorcounter = 0;
			sumfactors = 0;
			num = in.nextInt();
			if(num > 0)
			{
				for(int i = 1; i <= num; i++)
				{
					if(num % i == 0)
					{
							factorcounter++;
							System.out.println(i + " is a factor of " + num);
							sumfactors = sumfactors + i;
					}
				}
				System.out.println("The number of factors: " + factorcounter);
				if (sumfactors/2 == num)
				{
									System.out.println(num + " is a perfect number!");
				}
			}
			else
			{
							System.out.println("Invalid Input");
			}	
	}
}
}
