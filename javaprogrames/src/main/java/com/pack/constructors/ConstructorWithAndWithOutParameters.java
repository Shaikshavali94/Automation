package com.pack.constructors;

public class ConstructorWithAndWithOutParameters {
	ConstructorWithAndWithOutParameters() {

	}

	ConstructorWithAndWithOutParameters(int x) {
		System.out.println("The Value of X:" + x);

	}

	public static void main(String[] args) {
		ConstructorWithAndWithOutParameters cp = new ConstructorWithAndWithOutParameters();
		ConstructorWithAndWithOutParameters cp1 = new ConstructorWithAndWithOutParameters(100);

	}

}
