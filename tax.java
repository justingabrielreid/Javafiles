import java.util.Scanner;
public class tax
{
	public static void main(String[] args)
	{
		final double tucsonSalesTax = 8.10;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the price of the item: ");
		double price = in.nextDouble();
		double total = addTax(price, tucsonSalesTax);
		System.out.println("The total price including the sales tax is " + total);	
	}
	public static double addTax(double initialPrice, double tax)
	{
		double total = initialPrice + (initialPrice * tax / 100);
		return total;

	}
}
