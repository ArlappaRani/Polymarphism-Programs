package com.shapes.downcasting;

public class Geometry {
	
	public void doActivity(Shape sh)
	{
		//calling inherited method
		sh.draw();
		//calling over ride method
		System.out.println(sh.findArea());
		//calling the specialized method using instance of operator
		//calling the child methods
		if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).findPerimeter());
		}
		else if(sh instanceof Rectangle)
		{
			System.out.println(((Rectangle)(sh)).findPerimeter());
		}
		else if(sh instanceof Square)
		{
			System.out.println(((Square)(sh)).findPerimeter());
		}
		
 	}

}
