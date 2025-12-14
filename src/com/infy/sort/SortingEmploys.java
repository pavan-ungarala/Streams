//Sort employees by dept, then salary desc, then name.
package com.infy.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.infy.entity.Employee;

public class SortingEmploys {

	public static void main(String[] args) {
		List<Employee> employees = List.of( new Employee("A", "Sales", "Rep", 70000), new Employee("B", "Sales", "Rep", 90000), 
											new Employee("C", "HR", "BP", 85000), new Employee("D", "Tech", "SE2",120000), 
											new Employee("E", "Tech", "SE1",100000), new Employee("F", "Tech", "SE2",130000) );
		List<Employee> sortedEmploys = employees.stream()
												.sorted(Comparator.comparing(Employee::getDepartment)
														.thenComparing(Comparator.comparing(Employee::getSalary).reversed())
														.thenComparing(Employee::getName))
												        .collect(Collectors.toList());
		System.out.println("Sorted list of employs");
		sortedEmploys.forEach(System.out::println);

	}

}
