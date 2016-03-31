/** 
	This program that models the movement of an object of mass m that is attached to an oscillating spring. 
	Assuming the Springs motion follows Hooke's law F= -kx k = 10N/m. Initial v = 0. Change in time = .01s

	Goals of the program: 
	- Compute the accelerati on 	
	- Update velocity as it changes in .01s 
	- Update displacement as it changes in .01s 
	- every ten iterations plot the spring displacement as a bar where 1 pixel represents an image

*/

import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class HookesLaw
{
	public static void main(String[] args)
	{
	
		Scanner in = new Scanner(System.in);
		double mass = 0;
		double displacement = 0;
		System.out.print("Enter the mass of the object connected to the spring in kilograms: ");
		if(in.hasNextDouble())
		{
			mass = in.nextDouble(); 
		}
		else
		{
			System.out.println("Error value is not recognized.");
		}
		System.out.print("Enter the displacement from equilibrium: ");
		if(in.hasNextDouble())
		{
			displacement = in.nextDouble();	
		}	
		else
		{
			System.out.println("Error value is not recognized.");
		}
		motion(mass, displacement);
		
	}

/**
	This method computes the velocity of the object connected to the string.
	The velocity of the object at .01 intervals from 0s to 1s is stored in a
	ArrayList.
	The velocity values are then printed on the screen with their corresponding
	time values. 
*/
	public static ArrayList<Double> motion(double mass, double displacement)
	{
		final double deltaTime = .01; // units seconds
		final double k = 10; //units newton*meter
		ArrayList<Double> accel = new ArrayList<>();
		ArrayList<Double> vel = new ArrayList<>();
		ArrayList<Double> pos = new ArrayList<>();
		int i = 0; 
		double t = 0;
		double v = 0;
		double x = displacement;
		double a;
		while(i < 100)
		{
			a = (-k*x)/mass;
			v = a*t;
			x = displacement + v*t;
			pos.add(x);
			System.out.println("Time: " + t + " Velocity: " + v + " Distance: " + x);
			t = t + deltaTime;
			i++;
		}
		return pos;
		
	}




}
