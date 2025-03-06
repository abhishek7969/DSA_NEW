package abhi.java8.migration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Migrate_Int_To_Java8Stream {

	public static void main(String[] args) {
		
		int[] arr = { 4, 3, 2, 10, 9 };

		List<Integer> myList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
	}

}
