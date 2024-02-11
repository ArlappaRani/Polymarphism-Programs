package com.removerepitation.shapes;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the child class objects
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		Square sqr=new Square();
		//creating  the new geometry class objects and calling the 
		//method and passing child references
		Geometry gy=new Geometry();
		gy.doActivity(rec);
		gy.doActivity(cir);
		gy.doActivity(sqr);
		

	}

}
