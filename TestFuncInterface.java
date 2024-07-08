package Java_8;

@FunctionalInterface
public interface TestFuncInterface {
	public void displayMessage();
	
	public default void displayAccountType() {
		
	}

	public static void validateAccount() {
		
	}
	
}
