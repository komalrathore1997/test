package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1{
	String name;
	int age;
	public Product1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

public class StreamMain5 {

	public static void main(String[] args) {
         List<Product1>list1=new ArrayList<>();
         list1.add(new Product1("komal",25));
         list1.add(new Product1("tanu",28));
         list1.add(new Product1("sonu",23));
         list1.add(new Product1("Vishal",29));
         list1.add(new Product1("rajendra",50));
         list1.add(new Product1("geeta",48));
         
         List<Integer> seniorAge=list1.stream().filter(i->i.age>30).map(i->i.age).collect(Collectors.toList());
         
         System.out.println(seniorAge);
         
    
         
         
         
	}

}
