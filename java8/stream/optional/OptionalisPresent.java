package abhi.java8.stream.optional;

import java.util.Optional;

public class OptionalisPresent {
	public static void main(String[] args) {

		EmployeeOpt opt = new EmployeeOpt();

		Optional<EmployeeOpt> e = Optional.ofNullable(opt.findById(1));

		if (e.isPresent())
			System.out.println("Id from object is "+e.get().id);
		else
			System.out.println("Given id is not found.");

		// **************************************************//
		Optional<EmployeeOpt> eNull = Optional.ofNullable(null);

		if (eNull.isPresent())
			System.out.println(e.get());
		else
			System.out.println("Given id is not found or is null.");

	}
}
