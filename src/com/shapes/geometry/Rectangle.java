package com.shapes.geometry;

public class Rectangle extends Shape{
	//over ridden methods
	void draw()
	{
		System.out.println("Drawing the rectangle shape");
	}
	double FindArea()
	{
		double length=5.0;
		double breadth=6.8;
		return length*breadth;
	}

}
