package com.removerepitation.shapes;

public class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Drawing the Rectangle shape");
	}
	double findArea()
	{
		double length=5.0;
		double breadth=4.5;
		return length*breadth;
	}

}
