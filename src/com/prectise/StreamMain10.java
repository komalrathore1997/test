package com.prectise;

import java.util.ArrayList;
import java.util.List;

class Emp{
	int id;
	String name;
	String domen;
	public Emp(int id, String name, String domen) {
		super();
		this.id = id;
		this.name = name;
		this.domen = domen;
	}
	
	
}
public class StreamMain10 {
    public static void main(String[] args) {
		List<Emp>list=new ArrayList();
		list.add(new Emp(101,"komal","java"));
		list.add(new Emp(102,"sonu","python"));
		list.add(new Emp(103,"Vishal","operation"));
		list.add(new Emp(104,"divya","finance"));
		list.add(new Emp(105,"neha","healthcare"));
		list.stream()
		.filter(emp->emp.id>102)
	.forEach(emp->System.out.println(emp.name));
		
	}
}
