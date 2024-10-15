

package joshwa;

import java.util.Scanner;

class areacal

{

	double CalcArea(double x)

	{

		return 3.14*x*x;

	

	}

	

	float CalcArea(float x,float y)

	{

		return x*y;

	}

	double CalcArea(double x,double y)

	{

		return 0.5*x*y;

	}

}


public class area {

	public static void main(String[]args)

	{  

		Scanner sc = new Scanner(System.in);

		areacal ar = new areacal();

		System.out.println("enter the radius of circle:");

		double radius = sc.nextDouble();

		double circle= ar.CalcArea(radius);

		System.out.println("Area of Circle :"+circle);

		System.out.println("enter the length of rectangle:");

		float length =sc.nextFloat();

		System.out.println("enter breadth of rectangle:");

		float breadth =sc.nextFloat();

		float rectangle = ar.CalcArea(length, breadth);

		System.out.println("Area of Rectangle:"+rectangle);

		System.out.println("enter the baselength of triangle:");

		double blength =sc.nextDouble();

		System.out.println("enter height of triangle:");

		double height =sc.nextDouble();

		double triangle = ar.CalcArea(length, height);

		System.out.println("Area of Triangle:"+triangle);

		}

	}


