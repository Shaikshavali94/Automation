package com.pack.inheritance;

public class PClass {
	int a;
	void m1() {
		System.out.println("------------PClass------------------");
		System.out.println("The value of a is "+a);
	//	System.out.println("The value of b is "+b);
	}
	{
		System.out.println("instance block");
	}
}
class CClass extends PClass{
	int b;
	void m2() {
		System.out.println("==================CClass===================");
		System.out.println("The Value of a in Child class:"+a);
		System.out.println("The Value of b:"+b);
	}
}

class Inheritance1{
	public static void main(String[] args) {
		CClass ob = new CClass();
		ob.a=12;
		ob.b=10;
		ob.m2();
		ob.m1();
	}
	
}
