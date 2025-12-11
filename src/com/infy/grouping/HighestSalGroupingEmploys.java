//For each department, find the employee with the highest salary.
package com.infy.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.infy.entity.Employee;

public class HighestSalGroupingEmploys {

	public static void main(String[] args) {
		List<Employee> employs = List.of(new Employee("A", "Sales", "Rep", 70000), new Employee("B", "Sales", "Rep", 90000),
				   				 		 new Employee("C", "HR", "BP", 85000), new Employee("D", "Tech", "SE2",120000),
				   				 		 new Employee("E", "Tech", "SE1",100000), new Employee("F", "Tech", "SE2",130000));
		Map<String, Optional<Employee>> higestSalEmploys = employs.stream()
													   .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.maxBy(Comparator.comparingDouble(emp -> emp.getSalary()))));
		higestSalEmploys.forEach((dept, employ) -> System.out.println(dept+"  :  "+employ.orElse(null)));
	}

}
