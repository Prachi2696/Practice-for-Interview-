package streamyoutube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

class Employee {
	String name;
	String department;

	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
}

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. filter () 
		// input -> Predicate means boolean value function
		//
//2. map()
		// return value
		// perform operation on elements

//		get out name which starts with "a"
		List<String> names = Arrays.asList("prachi", "amey", "sagar", "magan", "ashish");

		for (String s : names) {
			if (s.startsWith("a")) {
				System.out.println(s);
			}
		}

		List<String> l = names.stream().filter(i -> i.startsWith("a")).collect(Collectors.toList());
		System.out.println(l);

		List<Integer> lint = Arrays.asList(1, 2, 3, 4);
		lint.stream().map(i -> i * i).forEach(System.out::println);

//3.sorted
//Grouping names by their length
		List<String> namess = Arrays.asList("John", "Jane", "Tom", "Anna", "Bob", "Mike");
		Map<Integer, List<String>> groupedByLength = namess.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(groupedByLength);

		// Example 2: Group Strings by First Letter
		List<String> fruits = Arrays.asList("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
		Map<Character, List<String>> m = fruits.stream().collect(Collectors.groupingBy(i -> i.charAt(0)));
		System.out.println(m);

		// Group Integers by Even or Odd
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<String, List<Integer>> m2 = numbers.stream()
				.collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "even" : "odd"));
		System.out.println(m2);

		// Example 4: Group Custom Objects by Field
		List<Employee> lemp = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"),
				new Employee("Charlie", "HR"), new Employee("David", "IT"));
		Map<String,List<Employee>> m3=lemp.stream().collect(Collectors.groupingBy(i -> i.department));
		System.out.println(m3);
		m3.forEach((dept,emp)->System.out.println(dept+" "+emp.stream().map(e->e.name).collect(Collectors.toList())));
		// find duplicate

		List<Integer> listnum = Arrays.asList(1, 1, 3, 1, 2, 3, 4);
//		listnum.stream().collect(Collectors)

	}

}
