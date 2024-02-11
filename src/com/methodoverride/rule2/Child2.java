package com.methodoverride.rule2;

public class Child2 extends Parent {
	// void display()//error bcz visibility is reduced 
	{
		System.out.println("dispaly child2" );
	}

}
