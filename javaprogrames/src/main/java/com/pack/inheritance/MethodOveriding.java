package com.pack.inheritance;

public class MethodOveriding {
	void dis(int x) {
		System.out.println("===========PClass===========");
		System.out.println("The Value of X:"+x);
	}
}

class MethodOverRidingCClass extends MethodOveriding{
	void dis(int y) {
		System.out.println("============CClass==============");
		System.out.println("The Value of y:"+y);
	}
}

class Inheritance2{
	public static void main(String[] args) {
		MethodOverRidingCClass ob = new MethodOverRidingCClass();
		ob.dis(10);
	}
}
