package com.revature.calculator.generic;

import com.revature.calculator.generic.Calculator;

public class CalculatorImpl <T extends Number> implements Calculator<T>{
	
		@Override
		public T add(T a,T b);
		
		@Override
		public T subtract(T a, T b);
		
		@Override
		public T multiply(T a, T b);
		
		@Override
		public T divide(T a, T b);
		
		// Advanced operations
		
		// Return x to the power e
		@Override
		public T exponent(T x, T e);
		
		// Return fib(i)
		@Override
		public T fibonacci(T i);
		
		// Parse a String into parameters and an operation
		// eg, given "5 + 2", return add(5, 2)
		// Look into String.parse()
		@Override
		public T parse(String s);

}
