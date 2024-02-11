package com.shapes.geometry;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of child classes
		Rectangle rec=new Rectangle();
		rec.draw();
		System.out.println(rec.FindArea());
		Square sqr=new Square();
		sqr.draw();
		System.out.println(sqr.FindArea());
		Circle cir=new Circle();
		cir.draw();
		System.out.println(cir.FindArea());
		
				

	}

}
