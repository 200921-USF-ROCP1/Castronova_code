package com.revature.fizzbuzz;

public class Driver {
	public static void main(String[] args) {
		
		int testValue = 15;
		
		FizzBuzz(testValue);
	}
	
	/*
	 * Given a positive integer A, print a line for each of the integers from 1 to A.
	 * But for multiples of 3, print "Fizz" instead of the number
	 * For multiples of 5, print "Buzz" instead of the number
	 * For multiples of 3 AND 5, print "FizzBuzz" instead of the number
	 */
	
	public static void FizzBuzz(int a) {
		for (int i = 1; i < a+1; i++) {
			
			//Alternatively put if (i % 3 == 0 && i % 5 == 0) first and if (i %3 == 0) after
			if(i % 3 == 0) {
				if(i % 5 == 0) {
					System.out.println("fizzbuzz");
				}
				else {
					System.out.println("fizz");
				}
			}
			else if(i % 5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
