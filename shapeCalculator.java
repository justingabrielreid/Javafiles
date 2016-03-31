
import java.util.Scanner; 

public class shapeCalculator 
{
	public static void main(String[] args)
	{
		double r = 0;
		double h = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("This program will accept the input values for the radius and height of a shape and return the volumes and surface areas of a sphere, cylinder, and cone with those dimensions.");
		System.out.println();
		System.out.print("Enter the radius and height of the shape seperated by a space: ");
		
		if (in.hasNextDouble())
		{
			r = in.nextDouble();
			h = in.nextDouble();
			System.out.print("Radius = " + r);
			System.out.println();
			System.out.print("Height = " + h);
			System.out.println();
			double sphereVol = sphereVolume(r);
			double sphereSur = sphereSurfaceArea(r);
			double cylinderVol = cylinderVolume(r, h);
			double cylinderSur = cylinderSurfaceArea(r, h);
			double coneVol = coneVolume(r, h);
			double coneSur = coneSurfaceArea(r, h);
			System.out.print("The volume of the sphere is " + sphereVol);
			System.out.println();
			System.out.print("The surface area of the sphere is " + sphereSur);
			System.out.println();
			System.out.print("The volume of the cylinder is " + cylinderVol);
			System.out.println();
			System.out.print("The surface area of the cylinder is " + cylinderSur);
			System.out.println();
			System.out.print("The volume of the cone is " + coneVol);
			System.out.println();
			System.out.print("The surface area of the cone is " + coneSur);
			System.out.println();
		}
		else
		{
			System.out.print("Enter a correct value for the radius and the height");
		}
		
		
	}

	public static double sphereVolume(double radius)
	{
		double volume = ((4.0 * Math.PI * Math.pow(radius, 3.0))/3.0);
		return volume; 
 
	}
	
	public static double sphereSurfaceArea(double radius)
	{
		double surfaceArea = (4.0*Math.PI*Math.pow(radius, 2.0));
		return surfaceArea;
	}
	public static double cylinderVolume(double radius, double height)
	{
		double volume = Math.PI*height*Math.pow(radius, 2.0);
		return volume;
	}
	public static double cylinderSurfaceArea(double radius, double height)
	{
		double surfaceArea = ((2.0*Math.PI*radius*height) + 		(2.0*Math.PI*Math.pow(radius, 2.0)));
		return surfaceArea;
	}
	public static double coneVolume(double radius, double height)
	{
		// volume of a right circular cone
		double volume = (Math.PI*Math.pow(radius, 2.0)*(height/3.0));
		return volume;
	}
	public static double coneSurfaceArea(double radius, double height)
	{
		double surfaceArea = Math.PI*radius*(radius + Math.sqrt(height*height + radius* radius));
		return surfaceArea;
	}
}
