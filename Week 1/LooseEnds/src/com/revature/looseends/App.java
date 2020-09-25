package com.revature.looseends;

/*
 * Annotations, including Override and Deprecated
 * final vs finalize vs finally
 * Var args (or the ...)
 */

public class App {
	public static void main(String[] args) {
		String a = "Hello", b = "there", c = "friend!";
		
		String[] arr = {a,b,c};
		printArgs(arr);
		
		printVarArgs(a, b, c);
		printVarArgs();
		
		printVarArgs(arr);
		
		System.out.printf("%d %d %d", 1, 2, 3);
	}
	
	public static void printArgs(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	//Var args uses ellipsis instead of array symbol to take 0 or more arguments
	public static void printVarArgs(String...strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	public static void aNameAndSomeStrings(String name, String...strings) {
		
	}
}
