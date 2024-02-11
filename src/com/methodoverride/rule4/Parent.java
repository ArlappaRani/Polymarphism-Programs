package com.methodoverride.rule4;

public class Parent {
	//return type  is having the class
	ElectronicDevice display()
	{
		System.out.println("display parent");
		ElectronicDevice ed=new ElectronicDevice();
		return ed;
	}

}
