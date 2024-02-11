package com.shapes.downcasting;

public class Rectangle extends Shape {
	double l=5.0;
	double b=4.0;
	
	//overridden method
	double findArea()
	{
		System.out.println("Area Of Rectangle:");
		return l*b;
	}
	//child Specific method
	double findPerimeter()
	{
		System.out.println("Perimeter of Rectangle:"); 
		return 2*(l+b);
	}

}
