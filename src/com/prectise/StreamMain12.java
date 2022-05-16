package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product3 {
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

public class StreamMain12 {
	public static void main(String[] args) {
		 List<Product3> list=new ArrayList<Product3>();
		 list.add(new Product3(1,"HP Laptop",25000f));
		 list.add(new Product3(2,"Dell Laptop",30000f));
		 list.add(new Product3(3,"Lenevo Laptop",28000f));
		 list.add(new Product3(4,"Sony Laptop",28000f));
		 list.add(new Product3(5,"Apple Laptop",90000f));
//		 
//		 List<Float>productPriceList=list.stream()
//				 .filter(p->p.price>30000)
//				 .map(Product3::getPrice)
//				 
//				 .collect(Collectors.toList());
//		 System.out.println(productPriceList);
		 
		 //converting list into map
		 
		 Map<Integer,String> productPriceMap=list.stream()
				 .collect(Collectors.toMap(p->p.id,p->p.name));
		 System.out.println(productPriceMap);
		 
		 //converting list into set
		 
		 Set<Float> productPriceSet=list.stream()
				 .filter(p->p.price<30000)
				 .map(p->p.price)
			     .collect(Collectors.toSet());
		 System.out.println(productPriceSet);
		 
		 //count
		 
		 long count=list.stream()
         .filter(p->p.price<40000)
         .count();
		 System.out.println("Count:"+count);
		 
		 //min and max
		 
		 Product3 min=list.stream().min((P1,p2)->P1.price>p2.price?1:-1).get();
		 System.out.println(min.price);
		 
		 Product3 max=list.stream().max((p3,p4)->p3.price>p4.price?1:-1).get();
		 System.out.println(max.price);
		 
//		 Map<Integer,String> mapValue=list.stream().min((p1,p2)->p1.price>p2.price?1:-1).get()
//         .collect(Collectors.toMap(p->p.price, p->p.name));
//		 
          float totalPrice=list.stream().map(p->p.price)
        		  .reduce(0.0f, (sum,price)->sum+price);
          System.out.println(totalPrice);
          
          Double totalPrice1=list.stream().collect(Collectors.averagingInt(x->x.price));
          System.out.println(totalPrice1);
		 
		 
	}
}
