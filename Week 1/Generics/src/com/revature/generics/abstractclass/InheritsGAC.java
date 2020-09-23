package com.revature.generics.abstractclass;

//Able to implement a generic, abstract class by giving a type in the extends clause
//
public class InheritsGAC extends GenericAbstractClass<Integer>{
	public Integer add (Integer a, Integer b) {
		return a + b;
	}
}
