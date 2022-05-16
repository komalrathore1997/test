package com.prectise;

import java.util.stream.Stream;

public class StreamMain3 {
    public static void main(String[] args) {
		//Stream API-Collection Process
    	//collection--> Group of Object
    	
    	//1-blank
    	Stream<Object>emptyStream=Stream.empty();
    	
    	//2
    	String names[]= {"durgesh","Ramesh","Ankit","Divya"};
    	Stream<String>Stream1=Stream.of(names);
    	Stream1.forEach(e->{
    		System.out.println(e);
    	});
    	}
	}

