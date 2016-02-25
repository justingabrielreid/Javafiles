import java.util.Scanner;
public class ScanString{
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string1 = in.next();
		int xcount = 0;
		int ycount = 0;
		int zcount = 0;
		for(int i = 0; i < string1.length(); i++)
		{
				char achar = string1.charAt(i);
				if (achar == 'x')
				{
						System.out.println("x found at position " + i);
						xcount++;
				}
				else if(achar == 'y')
				{
						
						System.out.println("y found at position " + i);
						ycount++;
				}
				else if (achar == 'z')
				{
						System.out.println("z found at position " + i);
						zcount++;
				}
				
				if (i == string1.length() -1)
				{
					System.out.println("number of characters " + string1.length());
					System.out.println("xcount: " + xcount);
					System.out.println("ycount: " + ycount);
					System.out.println("zcount: " + zcount);
				}
		}
		
		
	}
}
