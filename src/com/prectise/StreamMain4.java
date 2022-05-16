package com.prectise;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
class StreamMain4 {
    public static void main(String[] args) {
		  List<Custmor> list =new ArrayList<>();
		  list.add(new Custmor(101,"HP laptop",50000f));
		  list.add(new Custmor(102,"Apple laptop",90000f));
		  list.add(new Custmor(103,"Lenova laptop",65000f));
		  list.add(new Custmor(104,"Dell laptop",28000f));
		  list.add(new Custmor(105,"Asus laptop",34000f));
		  list.add(new Custmor(105,"Asus laptop",25000f));
		  
		  List<Float> productPriceList=new ArrayList<Float>();
		  for(Custmor product:list) {
			  if(product.price<30000) {
				  productPriceList.add(product.price);
			  }
		  }
		  System.out.println(productPriceList);
		 }

	
}
