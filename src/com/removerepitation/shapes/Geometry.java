package com.removerepitation.shapes;

public class Geometry {
	//creating the class and method and passing the parent reference
	public void doActivity(Shape sh)
	{
		//calling the repeated statements or methods
		sh.draw();
		System.out.println(sh.findArea());
	}

}
