package com.pack.java;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "shaikshavali";
		int stringLength = name.length();
		while(stringLength > 0) {
			System.out.print(name.charAt(stringLength-1));
			stringLength--;
		}

	}

}
