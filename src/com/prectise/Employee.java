package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MainClass{
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		Employee emp1=new Employee(101,"komal");
		Employee emp2=new Employee(102,"tanu");
		Employee emp3=new Employee(103,"kriti");
		Employee emp4=new Employee(104,"sangeeta");
		Employee emp5=new Employee(105,"neha");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		System.out.println("Original salary");
		System.out.println(list);
		
		List<Employee> incrementedSalary=list.stream().filter(a->a.getName().startsWith("k")).collect(Collectors.toList());
		
		System.out.println(incrementedSalary);
		
	}
}

class Employee {
    private int id;
    private String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
     
}

