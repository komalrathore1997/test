package com.prectise;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamMethod {
    public static void main(String[] args) {
		//filter(Predicate)
    	  //Boolean value function
    	//e->{ return true/false} 
    	//e->e>10
    	
    	List<String>names=List.of("amen","neha","kunal","shrisha","yogita","komal","vishal","durgesh","abhimanyu");
    	List<String>newNames=names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
    	System.out.println(newNames);
    	
    	System.out.println("\n");
    	
    	newNames.stream().forEach(System.out::println);
    	
    	//map(Function)
    	//we can perform operation on each element 
    	
    	List<Integer>number=List.of(23,4,67,8,98,56);
    	List<Integer>newList1=number.stream().map(i->i*i).collect(Collectors.toList());
    	System.out.println(newList1);
    	
    	//sort
    	
    	newList1.stream().sorted().forEach(System.out::println);
    	
    	Integer integer=newList1.stream().min((x,y)->x.compareTo(y)).get();
    	System.out.println("min"+integer);
    	
	}
}
