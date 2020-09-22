package revature.com.pillarsOfOOP;

public class Encapsulation {
	private int i;
	
	private String name;
	
	//We use getters to get values of private variables
	public int getI() {
		return i;
	}

	//Setters set a private value to a new value
	public void setI(int i) {
		this.i = i;
	}
	
	public String getName() {
		return name;
	}
	
	//Getters and setters can be public, but also default or protected depending on the need
	protected void setName(String name) {
		this.name = name;
	}
}
