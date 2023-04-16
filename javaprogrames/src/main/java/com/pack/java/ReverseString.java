package com.pack.java;

public class ReverseString {
	
	
	public static void main(String[] arg) {

		String input = "Independent";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		
		sb.reverse();
		System.out.println("Reversed String  : " + sb);
	}
		// Using For loop
	String input1 = "vali";
	{
		int iStrLength1 = input1.length();

		for (iStrLength1 = input1.length(); iStrLength1 > 0; --iStrLength1)

		{

			System.out.print(input1.charAt(iStrLength1 - 1));
		}

		// Using while loop
		String input2 = "Shaikshavali";

		int iStrLength2 = input2.length();
		while (iStrLength2 > 0)
		{
			System.out.print(input2.charAt(iStrLength2 - 1));
			iStrLength2--;
		}
	}

}
