package com.pack.inheritance;

public class MethodOverLoading {
	void add(int x, int y) {
		System.out.println("Sum:"+(x+y));
	}
}

class MethodOverLoadingCClass extends MethodOverLoading {
	void add(float a, float b) {
		System.out.println("Sum of a and b:"+(a+b));
	}
	void add(int a, float b) {
		System.out.println("Sum of a and b:"+(a+b));
	}
}

class Inheritance3{
	public static void main(String[] args) {
		MethodOverLoadingCClass ob = new MethodOverLoadingCClass();
		ob.add(10.5F, 10.5F);
		ob.add(10, 12.5F);
		ob.add(10, 10);
	}
}
