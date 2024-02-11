package com.limitations.upcasting;

public class Circle extends Shape {
	 double radius=0.5;
	 //override method
	 double findArea()
	 {
		 return Math.PI*radius*radius;
	 }
	 //child specific method
	 double findPerimeter()
	 {
		 return 2*Math.PI*radius;
	 }

}
