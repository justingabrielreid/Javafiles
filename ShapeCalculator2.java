import java.lang.Math;
public class ShapeCalculator2
{
	private double radius;
	private double height;
	private double length;
	private double width; 
	public double sphereVol(double radius)
	{
		double volume = (4*Math.PI /3)*Math.pow(radius, 3);
		return volume;
	}
	public double sphereArea(double radius)
	{
		double surfaceArea = 4*Math.PI*Math.pow(radius, 2);
		return surfaceArea;
	}
	public double cylinderVol(double radius, double height)
	{
			double volume = Math.PI*Math.pow(radius, 2)*height;
			return volume;
	}
	public double cylinderArea(double radius, double height)
	{
		double surfaceArea = 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
		return surfaceArea;
	}
	public double rectangleVol(double height, double width, double length)
	{
			double volume = height*width*length;
			return volume;
	}
	public double rectangleArea(double height, double width, double length)
	{
			double surfaceArea = 2*height*width + 2*height*length + 2*length*width;
			return surfaceArea;
	}
	public ShapeCalculator2(double r)
	{
		radius = r;
	}
	public ShapeCalculator2(double r, double h)
	{
		radius = r;
		height = h;
	}
	
	public ShapeCalculator2(double h, double l, double w)
	{
	
		height = h;
		length = l;
		width = w;
	}
}
