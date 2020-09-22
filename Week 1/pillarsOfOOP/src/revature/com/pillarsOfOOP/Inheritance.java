package revature.com.pillarsOfOOP;

public class Inheritance {
	String name;
	int age;
	
	public Inheritance(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void becomeOlder() {
		++age;
	}
	
	public void printSelf() {
		System.out.println(name);
		System.out.println(age);
	}
}
