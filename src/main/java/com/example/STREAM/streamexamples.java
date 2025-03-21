package com.example.STREAM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 30, 1, 4, 111, 80, 80);
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
		String input = "swiss";

		findEvenNumbers(list);
		findNumbersStartWith1(list);
		distinctNumbers(list);
		findSecSmallestLargest(list);
		wordOccuranceCount(words);
		convertliststringtiint(words);
		removeduplicate(list);
		elementscount(words2);
		findfirstnonrepeatingcharacter(input);
		// group a list of words by their first character using Streams
		groupwordsbyfirstcharacter(words);
		// Convert a `Map<Integer, String>` to a `List<String>` containing only the
		// values
		convertmaptolist();
		// Find the longest word in a list using Streams.
		longestword(words);
		// How do you find the three most frequently occurring words in a list using
		// Streams
		threemostoccuringword(words);
		// Given a list of dates, find the latest and earliest date using Streams.
		latestearliestdate();
//Implement a function to find the common elements between two lists using Streams.
		findcommonbetweentwolist();
		//Given a list of numbers, find all pairs whose sum equals a given target.
//		pairsumequaltotarget();
//		 Write a function to determine if a list of numbers is sorted using Streams.
		checksortedlist();
	}

//	private static void pairsumequaltotarget() {
//		// TODO Auto-generated method stub
////		List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,8);
////		int target = 9;
//		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//	        int target = 10;
//	       
//	       int i =  IntStream.range(0,numbers.size()-1). filter(b -> a < b && (a + b) == target)
//	       System.out.println(i+"----i");
////	            System.out.println("Pairs with sum " + target + ": " + pairs);
//	}

	private static void checksortedlist() {
		// TODO Auto-generated method stub
		List<Integer> sortedlist = Arrays.asList(1,2,3,4,5);
		List<Integer> unsortedlist = Arrays.asList(4,2,3,1,5);
		
		boolean b =IntStream.range(0,sortedlist.size()-1)
		.allMatch(i -> sortedlist.get(i)< sortedlist.get(i+1));
		
		System.out.println(b);
	}

	private static void findcommonbetweentwolist() {
		// TODO Auto-generated method stub
		List <Integer> list1 = Arrays.asList(1,2,3,4,5,6,8);
		List <Integer> list2 = Arrays.asList(4,5,6,7,8);
		
		list1.stream().filter(list2::contains).forEach(System.out::println);
		
	}

	private static void latestearliestdate() {
		// TODO Auto-generated method stub

		List<LocalDate> dates = Arrays.asList(LocalDate.of(2023, 5, 20), LocalDate.of(2021, 8, 15),
				LocalDate.of(2022, 3, 10), LocalDate.of(2024, 1, 5));

//		dates.stream().sorted().collect(Collectors.toList());
		dates.stream().sorted().limit(1).forEach(System.out::println);
//		dates.stream().sorted((a,b)-> LocalDate.compare(b,a)).limit(1).forEach(System.out::println);
		Optional<LocalDate> latest = dates.stream().max(LocalDate::compareTo);
		System.out.println("Latest Date : " + latest);

	}

	private static void threemostoccuringword(List<String> words) {
		// TODO Auto-generated method stub
		words.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		;
//		System.out.println(result);
	}

	private static void longestword(List<String> words) {
		// TODO Auto-generated method stub

		Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length));
		System.out.println(longestWord);
	}

	private static void convertmaptolist() {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");

		map.get(map);

		List<String> result = map.values().stream().collect(Collectors.toList());
		System.out.println(result);
	}

	private static void groupwordsbyfirstcharacter(List<String> words) {
		// TODO Auto-generated method stub
		Map<Object, List<String>> wordresult = words.stream().collect(Collectors.groupingBy(e -> e.charAt(0)));
		System.out.println(wordresult);
	}

	private static void findfirstnonrepeatingcharacter(String input) {
		// TODO Auto-generated method stub
		Character firstNonRepeating = input.chars().mapToObj(c -> (char) c) // Convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count
																												// occurrences
				.entrySet().stream().filter(entry -> entry.getValue() == 1) // Keep only non-repeating characters
				.map(Map.Entry::getKey).findFirst().orElse(null); // Return null if no unique character is found

		System.out.println("First non-repeating character: " + firstNonRepeating); // Output: 'w'
	}

	private static void elementscount(List<String> words) {
		// TODO Auto-generated method stub
		long count = words.stream().count();
		System.out.println("Number of elements: " + count); // Output: 4
	}

	private static void removeduplicate(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().distinct().forEach(System.out::print);
		System.out.println("\n");

	}

	private static void convertliststringtiint(List<String> words) {
		// TODO Auto-generated method stub
		List<Integer> intresult = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println(intresult);
	}

	private static void wordOccuranceCount(List<String> words) {
		// TODO Auto-generated method stub
		Map<Object, Long> count = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(count);
	}

	private static void findSecSmallestLargest(List<Integer> list) {
		// TODO Auto-generated method stub
		Optional<Integer> min = list.stream().distinct().sorted().findFirst();
		Optional<Integer> secondmin = list.stream().distinct().sorted().skip(1).findFirst();
		System.out.println(secondmin);

		Optional<Integer> secondlargest = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1)
				.findFirst();
		System.out.println(secondlargest);
	}

	private static void distinctNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
	}

	private static void findNumbersStartWith1(List<Integer> list) {
		// TODO Auto-generated method stub
		List<String> result = list.stream().map(e -> e + "").filter(e -> e.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(result);
	}

	private static void findEvenNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> result = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(result);
	}

}
