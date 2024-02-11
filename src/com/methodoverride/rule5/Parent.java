package com.methodoverride.rule5;

public class Parent {
	//Child covarient return type is present in Parent class
	Laptop display()
	{
		System.out.println("Dispaly Parent"); 
		Laptop lp=new Laptop();
		return lp;
	}

}
