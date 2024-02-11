package com.shapes.upcasting;

public class Rectangle extends Shape {
	void draw()
	{
		System.out.println("Drawing the Rectangle shape");
	}
	double findArea()
	{
		double length=5.5;
		double breadth=4.0;
		return length*breadth;
	}

}
