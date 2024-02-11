package com.methodoverride.rule5;

public class Child1 extends Parent{
//	ElectronicDecvice display() error bcz child class is having parent covarient return type
	{
		System.out.println("dispaly ");
		ElectronicDevice ed=new ElectronicDevice();
	//	return ed;
	}

}
