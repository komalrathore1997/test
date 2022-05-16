package com.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Custmor{
	int id;
	String name;
	float Price;
	float rating;
	public Custmor(int id, String name, float price,float rating) {
		
		this.id = id;
		this.name = name;
		this.Price = price;
		this.rating=rating;
		
	}
	
}
public class StreamMain11 {
    public static void main(String[] args) {
		 List<Custmor> list=new ArrayList<Custmor>();
		 list.add(new Custmor(1001,"HP laptop",45000f,3f));
		 list.add(new Custmor(1002,"asus laptop",35000f,4.5f));
		 list.add(new Custmor(1003,"dell laptop",55000f,2.3f));
		 list.add(new Custmor(1004,"Apple laptop",65000f,4.6f));
		 list.add(new Custmor(1005,"lenova laptop",35000f,3.9f));
		 list.add(new Custmor(1006,"linux laptop",25000f,2.0f));
		 
		 List<String> totalPrice = list.stream().filter(p->p.rating>3 && p.rating<5).map(p->p.name).forEach(System.out::println);
		 
//         System.out.println(totalPrice);   
              
	}
}
