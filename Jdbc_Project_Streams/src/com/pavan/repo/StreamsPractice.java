package com.pavan.repo;

import java.util.List;

public class StreamsPractice {
	
	public static void main(String[] args) {
		List<EmployeeDTO> employees = List.of(
			    new EmployeeDTO( "Pavan", "IT", 060000, 25.0),
			    new EmployeeDTO( "Ravi", "HR", 45000, 30.0),
			    new EmployeeDTO("Anil", "IT", 80000, 28.0),
			    new EmployeeDTO("Suresh", "Finance", 90000, 35.0),
			    new EmployeeDTO("Kiran", "IT", 50000, 23.0)
			);
		
		
		// loop thorough the list
//		employees.stream().forEach(System.out::println);
		
		// display the name of the people of it
		employees.stream().filter(e->e.getName().equals("IT")).forEach(System.out::println);

	}

}
