package com.pack.java;

public class StringExample1 {

	public static void main(String[] args) {
		String s1 = "shaikshavali";
		String s2 = "shaikshavali";
		String s3 = new String("shaikshavali").intern();
		String s4 = new String("Shaikshavali");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s3.compareTo(s4));
	}

}
