package com.shapes.downcasting;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of child classes
		Square sqr=new Square();
		Rectangle rec=new Rectangle();
		Circle crl=new Circle();
		Geometry gy=new Geometry();
		gy.doActivity(sqr);
		System.out.println("---------------------");
		gy.doActivity(rec);
		System.out.println("---------------------");
		gy.doActivity(crl);
		

	}

}
