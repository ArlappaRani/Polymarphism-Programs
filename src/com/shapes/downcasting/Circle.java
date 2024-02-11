package com.shapes.downcasting;

public class Circle extends Shape {
	double radius=3.4;
	double findArea()
	{
		System.out.println("Area Of Circle:");
		return Math.PI*radius*radius;
	}
	double findPerimeter()
	{
		System.out.println("Perimeter of Circle:");
		return 2*Math.PI*radius;
	}

}
