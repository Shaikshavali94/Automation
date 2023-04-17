package com.pack.collections;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Shaikshavali");
		hs.add("Amira");
		hs.add("Zubeda");
		
		for(String names : hs) {
			System.out.println(names);
		}

	}

}
