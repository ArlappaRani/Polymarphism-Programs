package com.methodoverride.rule1;

public class Child2 extends Parent{
	// void display()//error bcz parent class and child over ridden
	{//method having different access modifiers
		System.out.println("display child2");
	}

}
