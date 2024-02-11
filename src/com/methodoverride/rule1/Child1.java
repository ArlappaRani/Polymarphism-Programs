package com.methodoverride.rule1;

public class Child1 extends Parent{
	 public void display()
	{
		System.out.println("display child1");//no error because parent and child class
		// over ridden methods has same access modifiers
		
	}

}
