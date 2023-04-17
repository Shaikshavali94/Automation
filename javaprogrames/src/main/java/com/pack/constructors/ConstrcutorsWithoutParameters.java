package com.pack.constructors;

public class ConstrcutorsWithoutParameters {
	
	ConstrcutorsWithoutParameters(){
		System.out.println("=======Zero parameters constructor=========");
	}
	
	int add() {
		System.out.println("==============add()=================");
		return(12);
	}
	
}

 class Main{
	 public static void main(String[] args) {
		 ConstrcutorsWithoutParameters cwop = new ConstrcutorsWithoutParameters();
		 int k = cwop.add();
		 System.out.println("Value of k: "+k);
	 }
	
}
