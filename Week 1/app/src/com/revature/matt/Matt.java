package com.revature.matt;

public class Matt {
	//Data types
	
	boolean bool; //1 bit (t/f)
	byte b; //8 bits, 2^3
	short s; //16 bits, 2^4
	char c; //16 bits
	int i; //32 bits, 2^5
	float f; //32 bits
	long l; //64 bits, 2^6
	double d; //64 bits
	
	//Reference types contain a reference or ADDRESS of something in the heap
	String str = new String ("Hi Im new");
	char[] ch = {'I', ' ', 'a', 'm', ' ', 'n', 'e', 'w'}; //"I am new\"
	Object o = new Object();
	
	public void myMethod() { //Instance method
		//Instance method
		str.charAt(0); // 'H'
		
		//Static method
		String.valueOf(5); // "5"
	}
	
	//Access modifiers
	
	//Can be accessed anywhere in and out of the class
	void myPublicMethod () {}
	
	//No access modifier = default access modifier
	//Anything in the package can access, aka package-private
	void myDefaultMethod() {}
	
	//Protected means it can be accessed from inside the class and any subclasses/child classes
	protected void myProtectedMethod() {}
	
	//Private methods and variables can't be seen from anywhere but inside the class
	private void myPrivateMethod() {}
	
	//Classes can only be public and default unless declared inside of a class
	private class PrivateClass {}
	
	//Constructors
	//No params
	public Matt(){
		System.out.println("Iniside Matt constructor");
	}
	
	//Parameterized constructor
	//i here overshadows the class i
	public Matt(int i) {
		this.i = i; //Used to get to class variables
	}
	
	//Java favors the most specific scope
	
	//Control statements
	public void control(boolean yes, int val) {
		if (yes) {
			//Do something if yes is true
		}
		else if (val == 2){
			//Do something if val is 2
		}
		else {
			//Do something if the others are false
		}
		
		//For-loops iterate some n number of times
		//++i increments the value BEFORE being evaluated, i++ evaluates before incrementing
		//Difference doesn't matter with for loops
		for(int i = 0; i < val; ++i) { 
			if (val == i) {
				//Skips the rest of the CURRENT ITERATION and goes to the next
				continue;
			}
			
			//Break immediately exits the loop
			break;
		}
		
		while (yes) {
			//Do something while yes is true
			break;
		}
		
		do {
			//Run once and THEN run for as long as yes is true
			break;
		} 	while(yes);
		
		switch (val) {
		case 0:
			//Do something is val is 0
			break;
		
		default:
			//Do something if no other cases match
			break;
		}
	}
	
}
