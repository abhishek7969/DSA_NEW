package abhi.java8.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		Optional<String> name = getName();
		if(name.isPresent()) {
			System.out.println(name.get());
		}
		
		String name1 = name.orElse(callMe());
		System.out.println("Name 1 = "+name1);
		
		String name2 = name.orElseGet(() -> "Or Else Get");
		System.out.println(name2);

	}
	
	private static String callMe() {
		System.out.println("Called evey time");
		return "NA";
	}

	public static Optional<String> getName() {
		
		String name = "Ram";		
		return Optional.ofNullable(null);
		
	}

}
