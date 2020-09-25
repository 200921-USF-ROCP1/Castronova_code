package com.revature.generic.array;

public class GenericArray<T>{
	Object[] arr;
	T[] tarr;
	
	public GenericArray(T t) {
		arr = new Object[10];
		tarr = (T[])(new Object[10]);
		
		arr[0] = (Object)t;
		T otherT = (T)arr[0]; //Storing the reference to it, not the object itself
	}
}
