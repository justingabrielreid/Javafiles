/*
 * ShapeCalculator2tester.java
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
public class ShapeCalculator2tester{
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		// System.out.print("Enter the radius of a sphere: ");
		System.out.println("Enter the radius and height of a cylinder: ");
		double r= 0;
		double h = 0;
		double w = 0;
		double l = 0;
		while(in.hasNextDouble())
		{
			r = in.nextDouble();
			h = in.nextDouble();
			//ShapeCalculator2 sphere = new ShapeCalculator2(r);
			//System.out.println("Surface Area is " + sphere.sphereArea(r));
			//System.out.println("Volume is " + sphere.sphereVol(r));
			ShapeCalculator2 cylinder = new ShapeCalculator2(r,h);
			System.out.println("Volume is " + cylinder.cylinderVol(r,h));
			System.out.println("Surface area is " + cylinder.cylinderArea(r,h));
		}
	}
}

