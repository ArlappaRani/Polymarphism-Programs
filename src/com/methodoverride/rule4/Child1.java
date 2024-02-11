package com.methodoverride.rule4;

public class Child1  extends Parent{
	//return type is inherited class name
	Laptop display()
	{
		System.out.println("Display child");
		//creating the object of Laptop bcz we have to return
		Laptop lp=new Laptop();
		return lp;
		
	}
	

}
