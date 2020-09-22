package revature.com.pillarsOfOOP;

public abstract class AbstractClass { //Can't be instantiated, must be inherited
	public void printThis(String s) {
		System.out.println(s);
	}
	
	public abstract void doSomething(); //Required to be added to use
}
