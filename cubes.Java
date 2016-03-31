public class cubes 
{
	public static void main(String[] args)
	{
		double result1 = cubeVolume(15);
		double result2 = cubeVolume(35);
		System.out.println("The volume of the two cubes are " + result1 + " " + result2 + " with the respective side lengths 15 and 35.");
	}

	public static double cubeVolume(double sideLength)
	{
		/* This is an example of a static method. 
		the return type is a double, the parameter type is a double 
		and the parameter name is sideLength, which the method takes in and returns the volume of the cube.
		*/
		double volume = sideLength * sideLength * sideLength;
		return volume;
	}
}