package com.restControllerTest;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();
	
	static {
		list.getEmployeeList().add(new Employee("Lokesh","Gupta","howtodoinjava@gmail.com"));
		list.getEmployeeList().add(new Employee("Alex","kolenchiskey","abc@gmail.com"));
		list.getEmployeeList().add(new Employee("David","Kameron","titanic@gmail.com"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
