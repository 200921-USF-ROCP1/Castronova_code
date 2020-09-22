package com.revature.calculatorActivity;

import java.util.Scanner;

public class Driver {
	public static boolean errorCheck = true;
	/*
	 * Using your Calculator implementation
	 * Add exception handling
	 * Complete the method calculate() below.
	 */
	public static void main(String[] args) {
		
		

		System.out.println("Welcome to the Calculator!");
		System.out.println("Enter your command below:");
		

		
//		Driver d = new Driver();
//		if(d.getClass() == Driver.class) {}
//		if(d instanceof Driver) {}
		

		//The calculate method is run in an infinite loop
		  while (true) {
		  calculate();
		  }
		 
	}
		
		/* Calculate should:
		 * Take input via the Scanner class
		 * Parse the input (part of our Calculator interface)
		 * If it's a valid input, output the result
		 * If it's invalid, output an error
		 */
		
	public static void calculate() {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		
		CalculatorChild cc = new CalculatorChild();
		
		int x = cc.parse(userInput.toString());
		if(Driver.errorCheck == true) {
			System.out.println(x);
		}
	}
}
