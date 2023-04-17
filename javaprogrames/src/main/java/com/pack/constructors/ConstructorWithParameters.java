package com.pack.constructors;

import java.util.Scanner;

public class ConstructorWithParameters {
	String Username, Password;
	
	ConstructorWithParameters(String a, String b){
		Username = a;
		Password = b;
		}
		
	void getUserDetails() {
		System.out.println("===========UserDetails===========");
		System.out.println("Username:"+Username);
		System.out.println("Password:"+Password);
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Username:");
		String uName = s.nextLine();
		System.out.println("Enter the Password:");
		String pWord = s.nextLine();
		ConstructorWithParameters ul = new ConstructorWithParameters(uName,pWord);
		ul.getUserDetails();
	}
	
	
}
