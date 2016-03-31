/*
 * CannonBallTester.java
 * 
 * Copyright 2016 Justin <Justin@PROMETHEUS>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class CannonBallTester
{
	
	public static void main (String args[]) 
	{
		double x;
		double v;
		double a;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the initial horizontal position in meters: ");
		if(in.hasNextDouble())
		{
			x = in.nextDouble();
			Cannonball c1 = new Cannonball(x);
			System.out.print("Enter the angle in degrees and the initial velocity in meters: ");
			if (in.hasNextDouble())
			{
				a = in.nextDouble();
				v = in.nextDouble();
				c1.shoot(a,v);
			}	
		}
		
	}
}

