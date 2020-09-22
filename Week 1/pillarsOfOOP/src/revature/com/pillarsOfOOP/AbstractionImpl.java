package revature.com.pillarsOfOOP;

public class AbstractionImpl implements Abstraction{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
}
