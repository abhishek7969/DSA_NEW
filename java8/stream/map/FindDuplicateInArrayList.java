package abhi.java8.stream.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArrayList {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 15, 9, 3, 10);

		Set<Integer> set = new HashSet<>();

		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}

}
