package com.epam.calci_demo;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void addition (float a,float b){
		System.out.println(a + " + " +b +" = "+(a+b));
	}
	void subtraction (float a,float b){
		System.out.println(a + " - " +b +" = "+(a-b));
	}

	void  multiplication(float a,float b){
		System.out.println(a + " * " +b +" = "+(a*b));
	}

	void division (float a,float b){
		if(b==0){
			System.out.println("Second number should be greater than zero...");
		}
		else{
		System.out.println(a + " / " +b +" = "+(a/b));
		}
	}
}
