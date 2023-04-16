package com.pack.java;

public class Demo {
	public static void main(String[] args) {
		String string1 = "vali is vali";
		int count;

//		string = string.toLowerCase();
//
//		String words[] = string.split(" ");
//
//		System.out.println("Duplicate words in a given string : ");
//
//		for (int i = 0; i < words.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < words.length; j++) {
//				if (words[i].equals(words[j])) {
//					count++;
//					words[j] = "0";
//				}
//			}
//
//			if (count > 1 && words[i] != "0") {
//				System.out.println(words[i]);
//			}
//		}
//
//	}
		char string[] = string1.toCharArray();
		System.out.println("duplicate chararters in given string:");
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != '0') {
					count++;
					string[j] = '0';
				}

			}
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}

	}

}
