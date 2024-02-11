package com.shapes.upcasting;

public class Square  extends Shape{
	void draw()
	{
		System.out.println("Drawing the square shape");
	}
	double findArea()
	{
		double side=3.4;
		return side*side;
	}

}
