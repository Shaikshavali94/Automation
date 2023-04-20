package com.pack.java;

public class Demo1 {
	public static void main(String[] args) {
		String string1 = "shaikshavali";
		int count;
		char string[] = string1.toCharArray();
		System.out.println("Duplicate Characters are::");
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != '0') {
					count++;
					string[j] = '0';
				}

			}

			if (count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}
	}
}
