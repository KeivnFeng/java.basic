package org.basic.init;

public class Base {
	public void test(){}
	static {
		System.out.println("Base static block");
	}
	
	{
		System.out.println("Base block");
	}
	
	public Base(){
		System.out.println("Base constructor");
	}
}
