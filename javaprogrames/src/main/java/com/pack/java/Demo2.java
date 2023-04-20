package com.pack.java;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "This is this";
		int count;
		string = string.toLowerCase();
		
		String words[] = string.split(" ");
		System.out.println("Duplicate words are::");
		for(int i = 0; i < words.length; i++) {
			count = 1;
			for(int j=i+1; j < words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
				if(count > 1 &&  words[i] != "0") {
					System.out.println(words[i]);
				}
			}
		}
	}
}
