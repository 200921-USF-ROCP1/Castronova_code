package com.revature.calculatorActivity;

public class CalculatorChild implements Calculator{
	
	public void main(String[] args) {
		
		int testValue = 3;
		
		fibonacci(testValue);
	}
	// Basic operations
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	// Advanced operations
	
	// Return x to the power e
	public int exponent(int x, int e) {
		int num = 1;
		for (int i =0; i < e; i++) {
			num *=x;
		}
		
		return num;
		
		/* Recursive option
		 * public int exponentRecursive(int x, int e) {
		 *	 if(e==0) {
		 * 		return 1;
		 *   }
		 *   
		 *   return x*exponentRecursive(x, e-1);
		 *   }
		 */
	}
	
	// Return fib(i)
	public int fibonacci(int i) {
		if (i < 2) {
			return i;
		}
		else return fibonacci(i-1) + fibonacci(i-2);
//		int firstNum = 0;
//		int secondNum = 1;
//		int fibNum = 1;
//		for (int j = 1; j < i; j++) {
//			fibNum = firstNum + secondNum;
//			firstNum = secondNum;
//			secondNum = firstNum;
//			j++;
//		}
//		return fibNum;
	}
	
	// Parse a String into parameters and an operation
	// eg, given "5 + 2", return add(5, 2)
	// Look into String.split()
	public int parse (String s) {
		String[] parts = s.split(" "); //Results in : ["n1", "op", "n2"]
		
		if(Character.isDigit(parts[0].charAt(0))) {
			int n1 = Integer.parseInt(parts[0]);
			int n2 = Integer.parseInt(parts[2]);
			
			switch(parts[1]) {
			case "+":
				return add(n1, n2);
			case "-":
				return subtract(n1, n2);
			case "*":
				return multiply(n1, n2);
			case "/":
				if(n1 == 0 && n2 == 0) {
					try {
						throwAnException(0);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						Driver.errorCheck = false;
					}
				}
				else {
					return divide(n1, n2);
				}

			default:
				return 0;
			}
		}
		
		else {
			switch (parts[0]) {
			case "fib":
				return fibonacci(Integer.parseInt(parts[1]));
			case "exp":
				return exponent(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
			default:
				try{
					throwAnException(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Driver.errorCheck = false;
				}
			return 0;
			}
		}
	
		
		
//		int checkTest = 0;
//		char[] firstNum;
//		char[] secondNum;
//		for(int i = 0; i < s.length(); i++) {
//			char currChar = s.charAt(i);
//			if(Character.isDigit(currChar) == true) {
//				if(checkTest == 0) {
//					//firstNum.push(currChar);
//				}
//			}
//		}
	}
	
	public void throwAnException (int i) throws Exception {
		switch(i) {
			case 0:
				throw new Exception ("0 can't be divided by 0");
			case 1:
				throw new Exception ("Invalid input, try again!");
		}
	}
}
