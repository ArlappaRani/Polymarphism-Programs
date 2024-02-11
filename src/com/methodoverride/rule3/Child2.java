package com.methodoverride.rule3;

public class Child2 extends Parent{
	int calculate()
	{
		return 5+3;//No error,bcz parent and child class(overridden) return type is same
	}

}
