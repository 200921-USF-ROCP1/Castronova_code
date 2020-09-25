package com.revature.finallyize;

//Final vs finally vs finalize

//Final acts like Const in JS
//Final classes can't extended
public class WhatIsFinal {
	//Final variables can't be changed after initialization, act like Const in JS
	final int b = 5;
	
	//Final methods can't be overridden
	public final void doStuff() {
		
	}
	
	//Finally always runs even if the method has returned
	public void doFinally() {
		try {
		}
		catch (Exception e) {	
		}
		finally {
		}
	}
	
	//Finalize is run right before the object is destroyed by the Garbage Collector
	public void finalize() {
		//I will run once, upon my death
		
		//Just for logic that pertains to thhe program; low-level stuff is left to JVM
		
		//Release resources here that exist for the life of the method
	}
}
