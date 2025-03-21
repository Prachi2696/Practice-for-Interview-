package com.example.STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.omg.CORBA.PUBLIC_MEMBER;

//Given a list of employees (with fields `id`, `name`, `salary`), find the employee with the highest salary.
public class Employee {
	
	public int id;
	public String name;
	public double salary;
	
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
	
		Employee e1 = new Employee(1,"A",1000);
		Employee e2 = new Employee(2,"b",2000);
		Employee e3 = new Employee(3,"c",3000);
		List<Employee> emp= Arrays.asList(e1,e2,e3);
//		List<Double> emp1= Arrays.asList(e1.getSalary(),e2.getSalary(),e3.getSalary());
//		emp1.stream().sorted().limit(1).forEach(System.out::print);
		Optional<Employee> result=	emp.stream().max((a,b)->Double.compare(a.getSalary(), b.getSalary()));
		System.out.println(result);
//		List<Employee> emp= Arrays.asList(e1,e2,e3);
//		
//		emp.stream().sorted().forEach(System.out::println);
	}
}
