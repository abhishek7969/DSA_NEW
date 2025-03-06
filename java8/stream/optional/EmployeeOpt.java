package abhi.java8.stream.optional;

public class EmployeeOpt {
	int id;

	public EmployeeOpt(int id) {
		this.id = id;
	}

	public EmployeeOpt() {
	}

	public EmployeeOpt findById(int id) {
		return new EmployeeOpt(id);

	}

}
