package com.revature.annotations;

public class Animal {
	int eyeballs = 0;
	
	public void printEyeballs() {
		System.out.println("I'm a basic animal");
	}
}

//Annotations - keywords proceeded by @ that can go over anything in the program

class Bird extends Animal{
	
	//Override - Overwrite given command given by a parent
	@Override
	public void printEyeballs(){
		System.out.println("Probably 2");
	}
	
	//Deprecated - Used to show that something is being phased out
	@Deprecated
	public void printEyes() {
		System.out.println("Probably 2");
	}

}

//@MyAnnotation(AString = "AString");
class UsesBid {
	
	//Suppresss - removes warnings for the given block of code
	@SuppressWarnings("deprecation")
	public void useBird() {
		Bird b = new Bird();
		b.printEyes();
	}
}

//Allows you to make your own annotations
//@interface MyAnnotation {
//	String AString() default "A default value";
//  String AnotherString() default "B";
//}