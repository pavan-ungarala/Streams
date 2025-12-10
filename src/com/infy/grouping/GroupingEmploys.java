//Group employees by department.
package com.infy.grouping;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.infy.entity.Employee;

public class GroupingEmploys {

	public static void main(String[] args) {
		List<Employee> employs = List.of(new Employee("A", "Sales", "Rep", 70000), new Employee("B", "Sales", "Rep", 90000),
										   new Employee("C", "HR", "BP", 85000), new Employee("D", "Tech", "SE2",120000),
										   new Employee("E", "Tech", "SE1",100000), new Employee("F", "Tech", "SE2",130000));
		Map<String, List<Employee>> employsGroup = employs.stream()
														  .collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		Set<Entry<String, List<Employee>>> entrys = employsGroup.entrySet();
		System.out.println("::::: Employs based on the departments :::::");
		entrys.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue().toString()));
	}

}
