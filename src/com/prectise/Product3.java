package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product3 {
    int id;
    String name;
    float price;
    public Product3(int id, String name, float price) {
    	super();
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
    
}
class JavaStreamExample{
	public static void main(String[] args) {
		 List<Product3> list=new ArrayList<Product3>();
		 list.add(new Product3(1,"HP Laptop",25000f));
		 list.add(new Product3(2,"Dell Laptop",30000f));
		 list.add(new Product3(3,"Lenevo Laptop",28000f));
		 list.add(new Product3(4,"Sony Laptop",28000f));
		 list.add(new Product3(5,"Apple Laptop",90000f));
		 
		 List<Float>productPriceList=list.stream()
				 .map(Product3::getPrice)
				 .collect(Collectors.toList());
		 System.out.println(productPriceList);
	}
}

