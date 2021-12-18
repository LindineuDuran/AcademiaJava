package br.com.season.java8_lab06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * a. Get student with exact match name "jayesh" b. Get student with
 * matching address "1235" c. Get all student having mobile numbers
 * 3333. d. Get all student having mobile number 1233 and 1234 e.
 * Create a List<Student> from the List<TempStudent> f. Convert
 * List<Student> to List<String> of student name g. Convert
 * List<students> to String h. Change the case of List<String> i. Sort
 * List<String> j. Conditionally apply Filter condition, say if flag
 * is enabled then.
 *
 */
public class StreamTest
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Jayesh", 20, new Address("1234"), Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		Student student2 = new Student("Khyati", 20, new Address("1235"), Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
		Student student3 = new Student("Jason", 20, new Address("1236"), Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		/*****************************************************
		 * Get student with exact match name "jayesh"
		 *****************************************************/

		System.out.println("--------------------");
		students.stream().filter(s -> s.getName().equals("Jayesh")).forEach(s -> System.out.println(s));

		/*****************************************************
		 * Get student with matching address "1235"
		 *****************************************************/

		System.out.println("--------------------");
		students.stream().filter(s -> s.getAddress().getZipcode().equals("1235")).forEach(s -> System.out.println(s));

		/*****************************************************
		 * Get all student having mobile numbers 3333.
		 *****************************************************/

		System.out.println("--------------------");
		students.stream().map(s -> s.getMobileNumbers().stream().filter(n -> n.getNumber().equals("3333"))).collect(Collectors.toList());

		/*****************************************************
		 * Get all student having mobile number 1233 and 1234
		 *****************************************************/

		System.out.println("--------------------");

		/*****************************************************
		 * Create a List<Student> from the List<TempStudent>
		 *****************************************************/

		System.out.println("--------------------");

		/*****************************************************
		 * Convert List<Student> to List<String> of student name
		 *****************************************************/

		/*****************************************************
		 * Convert List<students> to String
		 *****************************************************/

		System.out.println("--------------------");

		/*****************************************************
		 * Change the case of List<String>
		 *****************************************************/

		System.out.println("--------------------");

		/*****************************************************
		 * Sort List<String>
		 *****************************************************/

		System.out.println("--------------------");

		/*****************************************************
		 * Conditionally apply Filter condition, say if flag is enabled then
		 *****************************************************/
		boolean sortConditionFlag = true;

		Stream<Student> conditionalFilterResult;

		System.out.println("Before sorting :");

		System.out.println("After filter and conditional sorting :");

	}
}
