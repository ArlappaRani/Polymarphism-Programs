package com.removerepitation.shapes;

public class Square extends Shape {
	void draw()
	{
		System.out.println("Drawing the Square shape");
	}
	double findArea()
	{
		double side=5.0;
		return side*side;
	}

}
