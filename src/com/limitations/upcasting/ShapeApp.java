package com.limitations.upcasting;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating Parent type reference
		Shape sh;
		//creating child(circle) class object
		//and assigning it to Parent reference
		sh=new Circle();//or Circle cr=new Circle();
                        //sh=cr; 
		
		//calling inherited method of circle using parent reference
		sh.draw();
		
		//calling  over ridden method using parent reference
		System.out.println(sh.findArea());
		
		//calling child Specific method using parent reference 
		//System.out.println(sh.findPerimeter()); 
		//calling this method is not possible bcz of limitation of up casting 
		
		
		
	}

}
