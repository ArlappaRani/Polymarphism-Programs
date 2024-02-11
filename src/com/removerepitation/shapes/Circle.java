package com.removerepitation.shapes;

public class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing the circle shape");
	}
	double findArea()
	{
		double radius=5.0;
		return Math.PI*radius*radius;
	}

}
