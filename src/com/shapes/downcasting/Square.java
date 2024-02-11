package com.shapes.downcasting;

public class Square extends Shape{
	double side=4.0;
	double findArea()
	{
		System.out.println("Area of Square :");
		return side*side;
	}
	double findPerimeter()
	{
		System.out.println("Perimeter of Square");
		return 4*side;
	}

}
