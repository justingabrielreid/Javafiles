/**
	This program is an improvement over the previous program which used the Vehicle class. Now a parameterized constructor will be added to the Vehicle class 
	in addition to the range method. 
*/
class Vehicle1
{
	// instance variables for Vehicle 
	int passangers; // number of passangers 
	int fuelcap; // fuel capacity 
	int mpg; // fuel consumption in miles per gallon 
	
	/**
		If the Vehicle class only contained the lines above this comment then it would only be a data only class. 
		While data only classes are sufficient, most classes also contain methods. This Vehicle class will be modified 
		to contain a method that computes the range of the Vehicle and print out this statement. 
	*/
	Vehicle1 (int p, int f, int m) //Constructor for Vehicle
	{
		passangers = p;
		fuelcap = f;
		mpg = m; 
	}
	//Displaying the range of the Vehicle: 
	int range()
	{
		return fuelcap*mpg;
	}
	//compute the fuel needed to for a certain distance 
	double fuelNeeded(int miles)
	{
		return miles / mpg;
	}
}

class VehicleConsDemo
{
	public static void main(String args[])
	{
		/**
			With the use of a constructor in the Vehicle class the instance variables can be defined once the minivan and sportscar objects are declared 
			instead of using a sequence of statements. 
		*/
		Vehicle1 minivan = new Vehicle(8,15,30);
		Vehicle1 sportscar = new Vehcile(2,12,18);
		double distance = 455; // distance in miles 
		double gallons; 

		gallons = minivan.fuelNeeded(distance);
		System.out.println("The gallons of fuel needed for the minivan to travel " + distance " miles is " + gallons);
		
		gallons = sportscar.fuelNeeded(distance);
		System.out.println("The gallons of fuel need for the sportscar to travel " + distance " miles is " + gallons);
		
		
		
	}
}