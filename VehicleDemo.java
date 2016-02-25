
/**
	This program is a demonstration of using classes. There are two classes in this program and when this is executed 
	by the compiler two class files will be created: Vehicle.class and VehicleDemo.class. It is not neccessary for both 
	of these programs to be in the same source file but to run this particular program VehicleDemo.java must be executed. 
*/
class Vehicle
{
	int passangers; // number of passangers 
	int fuelcap; // fuel capacity 
	int mpg; // fuel consumption in miles per gallon 
	
	/**
		If the Vehicle class only contained the lines above this comment then it would only be a data only class. 
		While data only classes are sufficient, most classes also contain methods. This Vehicle class will be modified 
		to contain a method that computes the range of the Vehicle and print out this statement. 
	*/
	//Displaying the range of the Vehicle: 
	void range()
	{
		System.out.println("The range of the Vehicle is " + fuelcap*mpg + " miles per gallon.");
	}
}

class VehicleDemo
{
	public static void main(String args[])
	{
		Vehicle minivan = new Vehicle();
		minivan.fuelcap = 16;
		minivan.mpg = 35;
		minivan.passangers = 8;
		System.out.print("The minivan can carry " + minivan.passangers);
		System.out.println();
		minivan.range();
		
	}
}