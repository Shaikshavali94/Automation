package com.pack.java;

public class ReverseString1 {

	public static void main(String[] args) {
		String name = "shaikshavali";
		int stringLength = name.length();
		for (stringLength = name.length(); stringLength > 0; --stringLength) {
			System.out.print(name.charAt(stringLength - 1));

		}

	}
}
