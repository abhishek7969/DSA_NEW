package abhi.java8.FI;

@FunctionalInterface
public interface TestFunctional {
	void singleAbstMethod();
	
	default void D1() {
		System.out.println("Inside D1");
	}
	
	default void D2() {
		System.out.println("Inside D2");
	}

}
