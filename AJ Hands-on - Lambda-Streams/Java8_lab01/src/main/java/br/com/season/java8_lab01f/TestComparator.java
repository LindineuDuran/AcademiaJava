package br.com.season.java8_lab01f;

import java.util.ArrayList;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Employee> employees = getEmployees();

		// Sort all employees by first name
		// Code Here

		// Let's print the sorted list
		System.out.println("Sort by first name");
		System.out.println("");
		System.out.println(employees);
		System.out.println("");

		// Sort all employees by first name; And then reversed
		// Code here

		// Let's print the sorted list
		System.out.println("Sort by first name - Reverse Order");
		System.out.println("");
		System.out.println(employees);
		System.out.println("");

		// Sorting on multiple fields; Group by.
		// code here

		System.out.println("Sort on multiple fields");
		System.out.println("");
		System.out.println(employees);
		System.out.println("");
	}

	private static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(6, "Yash", "Chopra", 25));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}
}
