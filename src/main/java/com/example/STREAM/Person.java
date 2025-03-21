package com.example.STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of `Person` objects (`name`, `age`), partition them into two groups: minors and adults.
public class Person {

	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Person> people = Arrays.asList(
		            new Person("Alice", 16),
		            new Person("Bob", 25),
		            new Person("Charlie", 17),
		            new Person("David", 30),
		            new Person("Eve", 12)
		        );
		  
		  people.stream().collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
		  
	
	}

}
