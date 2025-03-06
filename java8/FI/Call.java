package abhi.java8.FI;

public class Call {

	public static void main(String[] args) {

		TestFunctional tf = () -> System.out.println("My own Impl");
		
		tf.singleAbstMethod();
		
		TestFunctional f = Test :: myImpl;
		f.singleAbstMethod();
	}

}
