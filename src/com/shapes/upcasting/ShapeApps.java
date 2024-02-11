package com.shapes.upcasting;

public class ShapeApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shp=new Shape();
		Rectangle rl=new Rectangle();
		Square se=new Square();
		Circle cl=new Circle();
		
		shp=rl;
		shp.draw();
		System.out.println(shp.findArea());
		shp=se;
		shp.draw();
		System.out.println(shp.findArea());
		shp=cl;
		shp.draw();
		System.out.println(shp.findArea());

	}

}
